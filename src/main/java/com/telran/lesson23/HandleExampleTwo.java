package com.telran.lesson23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class HandleExampleTwo {

    public static void main(String[] args) {
        exampleCheckedException(null);
    }
    //Exception - NPE
    //Exception - IOException - FileNotFoundException

    private static void exampleTryWithResources(){
        try(FileReader reader = new FileReader("H")) {

        }catch (IOException e ) {

        }
    }

    private static void exampleCheckedException(String filename) {
        try {
            System.out.println("Try to read file with name " + filename + " and " +
                    " length " + filename.length());
            System.out.println(filename.charAt(3));
            FileReader fileReader = new FileReader(filename);
            int read = fileReader.read();
            fileReader.close();
        } catch (IOException | NullPointerException e) { // FileNotFoundException or extends!!
            System.out.println("File with name " + filename + " not found");
            System.out.println("Filename is incorrect");
//        } catch (FileNotFoundException e) {
//            System.out.println("cant read file");
//        }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//            System.out.println(e.getLocalizedMessage());
//        }
        }
    }
}
