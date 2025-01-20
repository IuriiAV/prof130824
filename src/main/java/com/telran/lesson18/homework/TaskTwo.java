package com.telran.lesson18.homework;

import java.io.*;

public class TaskTwo {

    public static void main(String[] args) {
        String pathFrom = "/Users/dogoda/java/prof130824/src/main/java/com/telran/lesson11";
        String pathTo = "/Users/dogoda/java/prof130824/src/main/java/com/telran/lesson18/dirForTest";
        copyFiles(pathFrom, pathTo);
    }

    public static void copyFiles(String pathFrom, String pathTo) {
        File file = new File(pathFrom);
        String[] innerPaths = file.list();
        if (innerPaths == null) {
            System.out.println("Invalid directory: " + pathFrom);
            return;
        }

        for (String innerPath : innerPaths) {
            File file1 = new File(pathFrom + File.separator + innerPath);
            String pathToCurrent = pathTo + File.separator + file1.getName();
            new File(pathTo).mkdirs();

            if (file1.isDirectory()) {
                copyFiles(file1.getAbsolutePath(), pathToCurrent);
            } else {
                try (
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathToCurrent)))
                ) {
                    char[] buffer = new char[1024];
                    int length;
                    while ((length = bufferedReader.read(buffer)) != -1) {
                        bufferedWriter.write(buffer, 0, length);
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
