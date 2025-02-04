package com.telran.lesson23;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * try - catch
 * use method signature
 */
public class HandleException {
    public static void main(String[] args) {
        try {
            exampleCheckedException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void exampleCheckedException() throws FileNotFoundException{
      //  try {
            FileReader fileReader = new FileReader("// home");
       // } catch (FileNotFoundException e) {
         //   System.out.println("Handle exception");
      //  }
    }
}