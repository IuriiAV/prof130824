package com.telran.lesson19.homework.coder_decoder;

import java.io.*;

public class Decoder {

    public void decodeFile(String codedTextPath) {
        File originalFile = new File(codedTextPath);
        String decodedTextPath = originalFile.getParent() + File.separator + "decodedText.md";
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(codedTextPath)));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(decodedTextPath)));
        ) {
            while (bufferedReader.ready()) {
                bufferedWriter.write(Character.toChars(Integer.parseInt(bufferedReader.readLine())));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
