package com.github.tommyettinger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Renamer {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("assets/listing-all.txt"));
        HashSet<String> distinct = new HashSet<>(lines.size());
        ArrayList<String> duplicates = new ArrayList<>(64);
        for (String line: lines) {
            if(!distinct.add(line))
                duplicates.add(line);
        }
        for(String d : duplicates){
            System.out.println(d);
        }
    }
}
