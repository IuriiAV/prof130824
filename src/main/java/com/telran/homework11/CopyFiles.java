package com.telran.homework11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFiles {

    public static void main(String[] args) {
        Path pathOut = Paths.get("/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/homework11/Out");
        Path pathInto = Paths.get("/Users/jmabra/Projects/Tel-Ran/Tel-Ran-JavaPro-Lessons/prof130824/src/main/java/com/telran/homework11/Into/");
        copy(pathOut, pathInto);
    }

    private static void copy(Path pathOut, Path pathInto) {
        try {
            List<Path> files = Files.list(pathOut).map(f -> f.getFileName()).toList();
            System.out.println(files);
            for (int i = 0; i < files.size(); i++) {
                Files.copy(Path.of(pathOut + "/" + files.get(i)), pathInto.resolve(files.get(i)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
