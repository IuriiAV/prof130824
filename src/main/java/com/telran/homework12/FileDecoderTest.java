package com.telran.homework12;

import java.io.IOException;
import java.net.URISyntaxException;

public class FileDecoderTest {
    public static void main(String[] args) throws IOException, URISyntaxException {
        FileDecoder fileDecoder = new FileDecoder();
        String content = fileDecoder.getContentFromFile();
        System.out.println(content);
        String encoded = fileDecoder.encodedText(content);
        System.out.println(encoded);
        String decoded = fileDecoder.decodedText(encoded);
        System.out.println(decoded);
        fileDecoder.putContentToFile(encoded);
    }
}
