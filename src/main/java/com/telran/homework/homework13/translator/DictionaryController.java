package com.telran.homework.homework13.translator;

import java.io.*;
import java.nio.file.Paths;

public class DictionaryController {

    private final Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
        start();
    }

    public void start() {
        System.out.println("""
                What would you like to do?
                [0] -> exit
                [1] -> Translate a word
                [2] -> Add a new word into the dictionary
                [3] -> Translate text""");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(reader.readLine());
            switch (i) {
                case 0 -> {
                }
                case 1 -> {
                    try {
                        translate(reader);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Non-existent language\nPlease correct your choice.");
                        translate(reader);
                    }
                }
                case 2 -> {
                    try {
                        update(reader);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Non-existent language\nPlease correct your choice.");
                        update(reader);
                    }
                }

                case 3 -> {
                    try {
                        translateText(reader);
                    } catch (IllegalArgumentException e) {
                        System.err.println("Non-existent language\nPlease correct your choice.");
                        translateText(reader);
                    }
                }
                default -> {
                    System.err.println("Please be sure that you've entered right number.");
                    start();
                }
            }
        } catch (BackToMenuException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void update(BufferedReader reader) throws IOException {
        Language language = chooseLanguage(reader);
        if (language == null) {
            update(reader);
            return;
        }
        addWord(reader, language);
    }

    private void addWord(BufferedReader reader, Language language) throws IOException {
        messageInputCurrentOption("original word");
        String original = reader.readLine();
        backToMenu(original);
        messageInputCurrentOption("translated word");
        String translate = reader.readLine();
        backToMenu(translate);
        dictionary.update(original, translate, language);
        System.out.println("You've added the word " + original.toUpperCase() + " to the dictionary");
        addWord(reader, language); // IMPORTANT: how to avoid this
    }

    private void messageInputCurrentOption(String option) {
        System.out.println("Input " + option + "\n[0] -> back to main menu");
    }

    private Language chooseLanguage(BufferedReader reader) throws IOException {
        System.out.println("Input language:\n[0] -> back to main menu\n[1] -> " + Language.ENGLISH + "\n[2] -> " + Language.GERMAN + "\n[3] -> " + Language.SPANISH);
        String strLanguage = reader.readLine();
        backToMenu(strLanguage);
        if (Language.values().length < Integer.parseInt(strLanguage)) {
            System.err.println("No such element in menu -> " + strLanguage);
            update(reader);
            return null;
        }
        Language language = Language.values()[Integer.parseInt(strLanguage) - 1];
        System.out.println("You've chosen " + language);
        return language;
    }

    private void backToMenu(String isBackRequest) {
        if (isBackRequest.equals("0")) {
            start();
            throw new BackToMenuException();
        }
    }

    private void translate(BufferedReader reader) throws IOException {
        Language language = chooseLanguage(reader);
        if (language == null) {
            translate(reader);
            return;
        }
        requestWord(reader, language);
    }

    private void requestWord(BufferedReader reader, Language language) throws IOException {
        messageInputCurrentOption("the word you need to translate");
        String requestedWord = reader.readLine();
        backToMenu(requestedWord);
        String translatedWord = dictionary.translate(language, requestedWord);
        System.out.println(translatedWord);
        requestWord(reader, language);// IMPORTANT: how to avoid this
    }

    private void translateText(BufferedReader reader) throws IOException {
        System.out.println("Paste a path to the file with text you want to translate:");
        String pathFrom = reader.readLine();
        Language language = chooseLanguage(reader);
        File fileFrom = new File(pathFrom);
        String pathTo = Paths.get(fileFrom.getParent(), fileFrom.getName() + "_" + language.getFileName()).toString();
        try (
                BufferedReader textReader = new BufferedReader(new InputStreamReader(new FileInputStream(pathFrom)));
                BufferedWriter textWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathTo)))) {
            while (textReader.ready()) {
                for (String word : textReader.readLine().split(" ")) {
                    String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
                    String translatedWord = dictionary.translate(language, cleanedWord);
                    textWriter.write(translatedWord + " ");
                }
                textWriter.write("\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println("You've paste wrong path to the file. Try again:");
            translateText(reader);
        } catch (IOException e) {
            System.err.println("Error while reading or writing file: " + e.getMessage());
        }
        System.out.println("Translation saved to: " + pathTo);
    }

    private void repeatAction() { // IMPORTANT: Is it possible to pass a method as an argument?

    }
}
