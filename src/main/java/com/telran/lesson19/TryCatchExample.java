package com.telran.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try {
 *
 *     Здесь пишем потенциальній кодкоторій может вікинуть исключения
 * } catch (Exception e) {
 *     Здесь пишем код для обработки возникшей ошибки
 * }finally {
 *     Пишем код , который должен быть выполнен в любом случае, вне зависимости от того, что было выше(ошибка или все норм)
 * }
 *
 * try - catch
 * try - catch - catch .... catch
 * try - finally
 * try - catch - finally
 */
public class TryCatchExample {

    public static void main(String[] args) throws IOException {
//        try {
//            //our code
//        } catch (Exception e) {
//
//        }

        String path = "D:\\Starta\\Java\\prof130824\\src\\main\\java\\com\\telran\\lesson19\\test.txt";
        readFile(path, new CustomFileInputStream(path));
        readFile(path, new FileInputStream(path));
    }

    private static void readFile(String path, FileInputStream fileInputStream) throws IOException {
        try {
            int read = fileInputStream.read();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("File with path " + path + " not found " +
                    e.getMessage());
            //throw new RuntimeException();
            //System.exit(0);
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            System.out.println("End of program");
        }

        System.out.println();
    }
}