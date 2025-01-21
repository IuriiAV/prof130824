package com.telran.lesson19.homework.coder_decoder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncoderTest {

    private Encoder encoder;

    @BeforeEach
    public void initCoder() {
        this.encoder = new Encoder();
    }

    @Test
    void testCopyFilesSymbolToNumeric() throws IOException {
        Path inputFile = Files.createTempFile("input", ".md");
        Path outputFile = Files.createTempFile("codedText", ".md");

        try (BufferedWriter writer = Files.newBufferedWriter(inputFile)) {
            writer.write("Hello");
        }

        encoder.encodeFile(inputFile.toString(), outputFile.toString());

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(outputFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append(" ");
            }
        }

        assertEquals("72 101 108 108 111", result.toString().trim());
    }

    @Test
    void testCopyEmptyFile() throws IOException {
        Path inputFile = Files.createTempFile("input", ".some");
        Path outputFile = Files.createTempFile("output", ".some");

        encoder.encodeFile(inputFile.toString(), outputFile.toString());

        assertEquals(0, Files.size(outputFile));
    }

    @Test
    void testCopyFileWithNonAscii() throws IOException {
        Path inputFile = Files.createTempFile("input", ".txt");
        Path outputFile = Files.createTempFile("output", ".txt");

        try (BufferedWriter writer = Files.newBufferedWriter(inputFile)) {
            writer.write("Привет");
        }

        encoder.encodeFile(inputFile.toString(), outputFile.toString());

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(outputFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append(" ");
            }
        }

        assertEquals("1055 1088 1080 1074 1077 1090", result.toString().trim());
    }
}
