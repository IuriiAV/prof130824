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
        if (!Files.exists(pathOut) || !Files.isDirectory(pathOut)) {
            System.out.println("The paths is incorrect or doesn't exist. Please, check. " + pathOut);
            return;
        }
        if (!Files.exists(pathInto)) {
            try {
                Files.createDirectories(pathInto);
                System.out.println("The directory was created. " + pathOut);
            } catch (IOException e) {
                System.out.println("Failed to create the directory " + pathInto);
                e.printStackTrace();
                return;
            }
        }

        List<Path> filesOutput;
        try {
            filesOutput = Files.list(pathOut).map(f -> f.getFileName()).toList();
        } catch (IOException e) {
            System.out.println("List with paths is not created");
            e.printStackTrace();
            return;
        }

        List<Path> filesInput;
        try {
            filesInput = Files.list(pathInto).map(f -> f.getFileName()).toList();
        } catch (IOException e) {
            System.out.println("List with paths is not created");
            e.printStackTrace();
            return;
        }

        try {
            for (int i = 0; i < filesOutput.size(); i++) {
                if (filesInput.contains(filesOutput.get(i))) {
                    System.out.println("File " + filesOutput.get(i) + " already exists");
                } else {
                    Files.copy(pathOut.resolve(filesOutput.get(i)), pathInto.resolve(filesOutput.get(i)));
                    System.out.println(filesOutput.get(i) + " is copied");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
