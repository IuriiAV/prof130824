package com.telran.lesson23;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *          Throwable
 *  Error               Exception
 *
 *  Error - ошибки уровня виртуальной машины, и нам не требуется их обрабатывать,
 *  у нас нет инструментов для их обработки(в большинстве случаев это вызвано некорректным
 *  кодом)
 *  StackOverFlowError(SOF), OutOfMemoryError(OOM)
 *
 *  Exception - Исключения, возникающие во время работы приложения, которые мы можем
 *  и "должны" обрабатывать
 *
 *  checked exception - проверяемые исключения должны быть обработаны обязательно и это будет
 *    подсказано на этапе написания кода, например попытка прочитать файл, при создании объекта
 *    FileReader, код не скомпилируется, пока мы не окружим его в блок try-catch или не пробросим
 *    исключение в сигнатуру метода
 *    Данное исключение известно на этапе написания кода!!
 *
 *    unchecked exception - исключения о которых мы можем не подозревать и они проявят себя во время
 *    выполнения программы, в тн рантайме, например NullPointerException, при компиляции никто не
 *    подскажет что в этом месте кода может быть проблема, проблема которая положит приложение во
 *    время выполнения
 *
 *    unchecked exceptions extends from RuntimeException
 *
 *    Exceptions in JDK - классы из стандартной библиотеки
 *    Custom Exceptions - классы которые мы создаем самостоятельно
 *
 *    Для перехвата и обработки исключений используется блок try-catch
 *
 *    Если мы говорим про стандартные исключения(из библиотеки), то проверяемые
 *    исключения обрабатываем try-catch, а не проверяемые - почти всегда можно обработать кодом
 */
public class ExceptionExample {

    public static void main(String[] args) {
        exampleCheckedException();
        exampleUncheckedException(10, 0);
        exampleUncheckedNPEException(null);
    }

    private static void exampleCheckedException() {
        try {
            FileReader fileReader = new FileReader("//home");
        } catch (FileNotFoundException e) {
            System.out.println("Handle exception");
        }
    }

    private static void exampleUncheckedException(int a , int b) {
        if( b == 0) return;
        System.out.println( a / b);
        //int i = Integer.parseInt("55a");
    }

    private static void exampleUncheckedNPEException(String str) {
        if (str == null) {
            System.out.println("String is null");
            return;
        }

        System.out.println(str.length());
    }
}
