package com.telran.homework16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EncoderDecoder {

    public void encode(String inputFile, String outputFile) throws IOException {
        String text = Files.readString(Path.of(inputFile));
        StringBuilder encoded = new StringBuilder();

        for (char ch : text.toCharArray()) {
            encoded.append((int) ch).append(" ");
        }

        Files.writeString(Path.of(outputFile), encoded.toString().trim());
    }

    public void decode(String inputFile, String outputFile) throws IOException {
        String encodedText = Files.readString(Path.of(inputFile));
        StringBuilder decoded = new StringBuilder();

        String[] codes = encodedText.split(" ");
        for (String code : codes) {
            int charCode = Integer.parseInt(code);
            decoded.append((char) charCode);
        }

        Files.writeString(Path.of(outputFile), decoded.toString());
    }
}
