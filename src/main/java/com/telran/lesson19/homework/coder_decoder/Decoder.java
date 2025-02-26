package com.telran.lesson19.homework.coder_decoder;

import java.io.*;

public class Decoder {

    public void decodeFile(String encodedTextPath, String decodedTextPath) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(encodedTextPath)));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(decodedTextPath)))
        ) {
            while (bufferedReader.ready()) {
                bufferedWriter.write(Character.toChars(Integer.parseInt(bufferedReader.readLine())));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
