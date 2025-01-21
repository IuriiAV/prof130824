package com.telran.lesson19.homework.coder_decoder;

import java.io.File;

public class App {

    public static void main(String[] args) {
        String originalPath = "/Users/dogoda/java/prof130824/src/main/java/com/telran/lesson19/homework/coder_decoder/originalText.md";
        String encodedPath = new File(originalPath).getParent() + File.separator + "encodedText.md";
        String decodedPath = new File(originalPath).getParent() + File.separator + "decodedText.md";

        Encoder encoder = new Encoder();
        encoder.encodeFile(originalPath, encodedPath);

        Decoder decoder = new Decoder();
        decoder.decodeFile(encodedPath, decodedPath);
    }
}
