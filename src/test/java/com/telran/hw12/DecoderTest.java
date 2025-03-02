package com.telran.hw12;

import com.telran.homework12.FileDecoder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoderTest {

    @Test
    public void encodedTest(){
        String text = "Hello, It's me";
        FileDecoder fileDecoder = new FileDecoder();
        String encodedText = fileDecoder.encodedText(text);
//        System.out.println(encodedText);
        Assertions.assertEquals("72/101/108/108/111/44/32/73/116/39/115/32/109/101/", encodedText );
    }
    @Test
    public void decodedTest(){
        String encodedText = "72/101/108/108/111/44/32/73/116/39/115/32/109/101/";
        FileDecoder fileDecoder = new FileDecoder();
        String decodedText = fileDecoder.decodedText(encodedText);
        Assertions.assertEquals("Hello, It's me", decodedText);
    }
}
