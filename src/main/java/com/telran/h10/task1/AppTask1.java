package com.telran.h10.task1;

import java.io.*;
import java.nio.file.*;


public class AppTask1 {

    public static void main(String[] args) {
        String originalTextFile = "C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h10\\task1\\originalText.txt";
        Path pathCodedText = Paths.get("C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h10\\task1\\codedText.txt");
        Path pathDeCodedText = Paths.get("C:\\IT\\JAVA PRO\\Lesson\\src\\main\\java\\com\\telran\\h10\\task1\\decoded.txt");
        Unit unit = new Unit();
        unit.encoder(originalTextFile, pathCodedText);

        unit.decoder(pathCodedText, pathDeCodedText);


    }
}
