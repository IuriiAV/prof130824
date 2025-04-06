package com.telran.homework16;

import java.io.IOException;

public class EncoderDecoderApp {

    public static void main(String[] args) {
        EncoderDecoder encoderDecoder = new EncoderDecoder();

        String inputFilePath = "src/main/java/com/telran/homework16/input.txt";
        String encodedFilePath = "src/main/java/com/telran/homework16/encoded.txt";
        String decodedFilePath = "src/main/java/com/telran/homework16/decoded.txt";

        try {
            encoderDecoder.encode(inputFilePath, encodedFilePath);
        } catch (IOException e) {
            e.getMessage();
        }

        try {
            encoderDecoder.decode(encodedFilePath, decodedFilePath);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
