package com.telran.lesson19.homework.coder_decoder;

import java.io.*;

public class Encoder {

    public void encodeFile(String originalTextPath, String codedTextPath) {
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(originalTextPath)));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(codedTextPath)))
        ) {
            while (bufferedReader.ready()) {
                bufferedWriter.write(bufferedReader.read() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
