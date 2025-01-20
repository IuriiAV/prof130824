package com.telran.lesson19.homework.coder_decoder;

public class App {

    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.codeFile("/Users/dogoda/java/prof130824/src/main/java/com/telran/lesson19/homework/coder_decoder/originalText.md");

        Decoder decoder = new Decoder();
        decoder.decodeFile("/Users/dogoda/java/prof130824/src/main/java/com/telran/lesson19/homework/coder_decoder/codedText.md");
    }
}
