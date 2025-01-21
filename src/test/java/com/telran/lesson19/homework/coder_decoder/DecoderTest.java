package com.telran.lesson19.homework.coder_decoder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoderTest {

    private Decoder decoder;

    @BeforeEach
    public void initCoder() {
        this.decoder = new Decoder();
    }

    @Test
    void testCopyFilesNumericToSymbols() throws IOException {
        Path inputFile = Files.createTempFile("input", ".md");
        Path outputFile = Files.createTempFile("encodedText", ".md");

        try (BufferedWriter writer = Files.newBufferedWriter(inputFile)) {
            writer.write("72\n101\n108\n108\n111");
        }

        decoder.decodeFile(inputFile.toString(), outputFile.toString());

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(outputFile)) {
            while (reader.ready()) {
                result.append(reader.readLine());
            }
        }

        assertEquals("Hello", result.toString().trim());
    }

    @Test
    void testCopyEmptyFile() throws IOException {
        Path inputFile = Files.createTempFile("input", ".some");
        Path outputFile = Files.createTempFile("output", ".some");

        decoder.decodeFile(inputFile.toString(), outputFile.toString());

        assertEquals(0, Files.size(outputFile));
    }

    @Test
    void testCopyFileWithNonAscii() throws IOException {
        Path inputFile = Files.createTempFile("input", ".txt");
        Path outputFile = Files.createTempFile("output", ".txt");

        try (BufferedWriter writer = Files.newBufferedWriter(inputFile)) {
            writer.write("1055\n1088\n1080\n1074\n1077\n1090");
        }

        decoder.decodeFile(inputFile.toString(), outputFile.toString());

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(outputFile)) {
            while (reader.ready()) {
                result.append(reader.readLine());
            }
        }

        assertEquals("Привет", result.toString());
    }
}
