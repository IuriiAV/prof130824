package com.telran.lesson23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleExceptionTwo {

    public static void main(String[] args) {
        exampleCheckedException("//home/t.txt");
    }
    //Exception - NPE
    //Exception - IOException - FileNotFoundException

    private static void exampleTryWithResources() {
        try (FileReader reader = new FileReader("H")) {

        } catch (IOException e){
    }
}

    private static void exampleCheckedException(String filename) {
        try {
            System.out.println("Try to read file with name " + filename + "and" + "length " + filename.length());
            System.out.println(filename.charAt(10));

            FileReader fileReader = new FileReader(filename);
           // int read = fileReader.read();

        } catch (FileNotFoundException | NullPointerException e) { // FileNotFoundException or extends!!
            System.out.println("File with name " + filename + "not found");


//        } catch (NullPointerException e) {
//            System.out.println("Filename is incorrect");
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
        }
    }
}