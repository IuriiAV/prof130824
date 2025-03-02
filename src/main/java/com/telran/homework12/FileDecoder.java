package com.telran.homework12;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

public class FileDecoder {
    public String getContentFromFile() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("text.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        StringBuilder content = new StringBuilder();

        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                content.append(line);
            }
        }
        return content.toString();
    }

    public void putContentToFile(String content) throws URISyntaxException, IOException {
        URL url = getClass().getClassLoader().getResource("decoded.txt");
        System.out.println(url.toURI());
        FileOutputStream outputStream = new FileOutputStream(new File(url.toURI()));
        outputStream.write(content.getBytes());
        outputStream.close();
    }

    public String encodedText(String content) {
        String encoded = "";
        for (int i = 0; i < content.length(); i++) {
            char letter = content.charAt(i);
            encoded += String.valueOf(Integer.valueOf(letter));
            encoded += "/";
        }
        return encoded;
    }

    public String decodedText(String content) {
        String decoded = "";
        String[] letters = content.split("/");
        for (String letter: letters) {
            int numbers = Integer.valueOf(letter);
            char c = (char) numbers;
            decoded += c;
        }
        return decoded;
    }
}
