package com.telran.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * try {
 * Здесь пишем код, который потенциально может выкинуть исключение
 * } catch(Exception e) {
 * Здесь пишем код для обработки возникшей ошибки
 * <p>
 * } finally {
 * Пишем код, который должен быть выполнен в любом случае,
 * вне зависимости от того, что было выше (ошибка или все норм)
 * }
 * <p>
 * try - catch
 * try - catch - catch ... catch
 * try - finally
 * try - catch - finally
 */
public class TryCatchExample {

    public static void main(String[] args) throws IOException {
        String path = "/Users/iurii/Downloads/pro130824/src/main/java/com/telran/lesson19/test.txt";
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
