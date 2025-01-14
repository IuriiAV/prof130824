package com.telran.lesson18InputOutputStream;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

/**
 * Родительские классы:
 * InputStream - для чтения набора байт
 * OutputStream - для записи набора байт
 * Reader - для чтения символов
 * Writer - для записи символов
 * <p>
 * 3 стандартных потока: System.out
 *
 * FileInputStream
 * FileOutputStream
 * FileReader
 * FileWriter
 *
 * InputStreamReader - конвертер байтов в символы
 * OutputStreamWriter -
 */
public class InputOutputExample {

    public static void main(String[] args) throws IOException {
        System.out.println("Hi");
        //System.out - стандартный поток вывода - по дефолту в консоль
        PrintStream out = System.out;
        //System.setOut();
        //можно переопределить вывод в консоль

        System.out.printf("x = %d%n", 10);
        //%n - перенос строкиб %.2f - дробное число, %c, %s

        System.out.printf("%.3f", Math.PI);
        float x = 3456.345f;
        System.out.printf("%n%2.2f", x);
        Date date = new Date();
        System.out.printf("%n%tT", date);
        System.out.printf("%n%tH %tM %tS", date, date, date);
        System.out.println();

//        Map<String, String> getenv = System.getenv();
//        System.out.println(getenv);

        //System.in - стандартный поток для ввода с консоли (Scanner)
        InputStream in = System.in;

//        FileInputStream fileInputStream = new FileInputStream("path");
//        Scanner sc = new Scanner(fileInputStream);
//        String s = sc.next();

//        Scanner scanner = new Scanner("Hello\nJava");
//        while (scanner.hasNext()){
//            System.out.println(scanner.next());
//        }

        InputStreamReader inputStreamReader = new InputStreamReader(in);
        int read = inputStreamReader.read();
        System.out.println(read);

        byte[] buffer = new byte[4];
        System.out.println(Arrays.toString(buffer));
        int read1 = in.read(buffer);
        System.out.println(read);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Integer.parseInt(s);

        //System.error - поток для ошибок
        System.out.println("good message");
        System.err.println("error");

    }
}
