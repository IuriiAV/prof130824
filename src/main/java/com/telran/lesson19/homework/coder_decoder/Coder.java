package com.telran.lesson19.homework.coder_decoder;

import java.io.*;

public class Coder {

    public void codeFile(String originalTextPath) {
        File originalFile = new File(originalTextPath);
        String codedTextPath = originalFile.getParent() + File.separator + "codedText.md";
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(originalTextPath)));
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(codedTextPath)));
        ) {
            while (bufferedReader.ready()) {
                bufferedWriter.write(String.valueOf(bufferedReader.read()) + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
