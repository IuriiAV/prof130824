package com.telran.myLesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * try{
 * code, that can throw an exception
 * } catch(Exception e){
 * code for error handling
 * } finally {
 * code will be executed in any case
 * }
 * <p>
 * блок try не существует один,
 * catch может быть несколько,
 * try может быть с finally, или catch или и catch, и finally
 */
public class TryCatchExample {

    public static void main(String[] args) {
        String path = "/out.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("File is not found " + e.getMessage());
           // throw new RuntimeException(); //прервется выполнение программы
            System.exit(0);
        }
        System.out.println("end");
    }
}
