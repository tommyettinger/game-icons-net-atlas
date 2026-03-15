package com.github.tommyettinger.headless;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.headless.HeadlessApplication;
import com.badlogic.gdx.backends.headless.HeadlessApplicationConfiguration;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.github.tommyettinger.Main;

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;

public class Renamer extends ApplicationAdapter {
    @Override
    public void create() {
        FileHandle[] folders = Gdx.files.local("assets/").list();
        FileHandle target = Gdx.files.local("../docs/flat/");
        for(FileHandle folder : folders){
            FileHandle[] byAuthor = folder.list();
            for(FileHandle image : byAuthor){
                FileHandle intended = target.child(image.name());
                if(intended.exists()){
                    FileHandle newIntended = target.child(image.nameWithoutExtension() + "-alt.png");
                    if(newIntended.exists())
                        throw new GdxRuntimeException("File already exists! " + newIntended);
                    image.copyTo(newIntended);
                }
                else {
                    image.copyTo(intended);
                }
            }
        }

//        try {
//        List<String> lines = Files.readAllLines(Paths.get("assets/listing-all.txt"));
//        HashSet<String> distinct = new HashSet<>(lines.size());
//        ArrayList<String> duplicates = new ArrayList<>(64);
//        for (String line: lines) {
//            if(!distinct.add(line)) {
//                if(!distinct.add(line.replace(".png", "-alt.png")))
//                    System.out.println("Collision on " + line);
//            }
//        }
//        for(String d : duplicates){
//            System.out.println(d);
//        }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }

    public static void main(String[] args) {
        createApplication();
    }

    private static Application createApplication() {
        // Note: you can use a custom ApplicationListener implementation for the headless project instead of Main.
        return new HeadlessApplication(new Renamer(), getDefaultConfiguration());
    }

    private static HeadlessApplicationConfiguration getDefaultConfiguration() {
        HeadlessApplicationConfiguration configuration = new HeadlessApplicationConfiguration();
        configuration.updatesPerSecond = -1; // When this value is negative, Main#render() is never called.
        //// If the above line doesn't compile, it is probably because the project libGDX version is older.
        //// In that case, uncomment and use the below line.
        //configuration.renderInterval = -1f; // When this value is negative, Main#render() is never called.
        return configuration;
    }
}
