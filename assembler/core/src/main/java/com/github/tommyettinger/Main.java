/*
 * Copyright (c) 2022 Tommy Ettinger.
 * The parent project is
 * https://github.com/tommyettinger/game-icons-net-atlas
 * Licensed identically to Game-Icons.net's images; for the list of contributors who must be credited, see:
 * https://github.com/tommyettinger/game-icons-net-atlas/blob/main/Game-Icons-License.txt
 */

package com.github.tommyettinger;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class Main extends ApplicationAdapter {
    @Override
    public void create() {
        StringBuilder sb = new StringBuilder(4096);
        sb.append("""
                <!doctype html>
                <html>
                <head>
                \t<title>Game-Icons.net Preview</title>
                \t<meta http-equiv="content-type" content="text/html; charset=UTF-8">
                \t<meta id="gameViewport" name="viewport" content="width=device-width initial-scale=1">
                \t<link href="styles.css" rel="stylesheet" type="text/css">
                </head>
                                    
                """);
        sb.append("<body>\n");
        sb.append("<h1>Game-Icons.Net Preview</h1>\n");
        sb.append("<p>This shows all icons supported by " +
                  "<a href=\"https://github.com/tommyettinger/game-icons-net-atlas\">game-icons-net-atlas</a>, " +
                  "along with the two names each can be looked up by.</p>\n");
        sb.append("""
                <p>The atlases and all image assets are licensed under CC-BY 3.0 (some are individually licensed as CC0,
                  which doesn't affect the complete atlas; it's still CC-BY 3.0). The icons here were made by:</p>
                <ul>
                  <li>Lorc, <a href="http://lorcblog.blogspot.com">http://lorcblog.blogspot.com</a></li>
                  <li>Delapouite, <a href="https://delapouite.com">https://delapouite.com</a></li>
                  <li>John Colburn, <a href="http://ninmunanmu.com">http://ninmunanmu.com</a></li>
                  <li>Felbrigg, <a href="http://blackdogofdoom.blogspot.co.uk">http://blackdogofdoom.blogspot.co.uk</a></li>
                  <li>John Redman, <a href="http://www.uniquedicetowers.com">http://www.uniquedicetowers.com</a></li>
                  <li>Carl Olsen, <a href="https://twitter.com/unstoppableCarl">https://twitter.com/unstoppableCarl</a></li>
                  <li>Sbed, <a href="http://opengameart.org/content/95-game-icons">http://opengameart.org/content/95-game-icons</a></li>
                  <li>PriorBlue</li>
                  <li>Willdabeast, <a href="http://wjbstories.blogspot.com">http://wjbstories.blogspot.com</a></li>
                  <li>Viscious Speed, <a href="http://viscious-speed.deviantart.com">http://viscious-speed.deviantart.com</a></li>
                  <li>Lord Berandas, <a href="http://berandas.deviantart.com">http://berandas.deviantart.com</a></li>
                  <li>Irongamer, <a href="http://ecesisllc.wix.com/home">http://ecesisllc.wix.com/home</a></li>
                  <li>HeavenlyDog, <a href="http://www.gnomosygoblins.blogspot.com">http://www.gnomosygoblins.blogspot.com</a></li>
                  <li>Lucas</li>
                  <li>Faithtoken, <a href="http://fungustoken.deviantart.com">http://fungustoken.deviantart.com</a></li>
                  <li>Skoll</li>
                  <li>Andy Meneely, <a href="http://www.se.rit.edu/~andy/">http://www.se.rit.edu/~andy/</a></li>
                  <li>Cathelineau</li>
                  <li>Kier Heyl</li>
                  <li>Aussiesim</li>
                  <li>Sparker, <a href="http://citizenparker.com">http://citizenparker.com</a></li>
                  <li>Zeromancer</li>
                  <li>Rihlsul</li>
                  <li>Quoting</li>
                  <li>Guard13007, <a href="https://guard13007.com">https://guard13007.com</a></li>
                  <li>DarkZaitzev, <a href="http://darkzaitzev.deviantart.com">http://darkzaitzev.deviantart.com</a></li>
                  <li>SpencerDub</li>
                  <li>GeneralAce135</li>
                  <li>Zajkonur</li>
                  <li>Catsu</li>
                  <li>Starseeker</li>
                  <li>Pepijn Poolman</li>
                  <li>Pierre Leducq</li>
                  <li>Caro Asercion</li>
                </ul>
                <p>(Projects that use this atlas can copy the above list of Game-Icons.net contributors to comply with
                  its license.)</p>
                """);
        sb.append("<div class=\"box\">\n");
//        for (JsonValue entry = json.child; entry != null; entry = entry.next) {
//            String emojiChar = entry.getString("char");
//            String name = entry.getString("name");
//            String emojiFile = "flat/" + name + ".png";
//            sb.append("\t<div class=\"item\">\n")
//                    .append("\t\t<img src=\"")
//                    .append(emojiFile).append("\" alt=\"").append(name).append("\" />\n")
//                    .append("\t\t<p>").append(emojiChar).append("</p>\n")
//                    .append("\t\t<p>").append(name).append("</p>\n")
//                    .append("\t</div>\n");
//        }
        sb.append("</div>\n</body>\n");
        sb.append("</html>\n");
        Gdx.files.local("index.html").writeString(sb.toString(), false, "UTF8");

    }
}