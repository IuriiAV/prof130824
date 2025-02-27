package com.telran.lesson23;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Throwable
 * Error               Exception
 * <p>
 * Error - ошибки уровня виртуальной машины, и нам не требуется их обрабатывать, у нас нет инструментов для их обработки
 * (в большинств случаев это вызвано некорректным кодом)
 * Пример
 * StackOverFlowError(SOF), OutofMemoryError(OOM)
 * <p>
 * Exception - Исключения, возникающие во время работы приложения, которые мы можем и "должны" обрабатывать
 * <p>
 * checked exception - проверяемые исключения должны быть обработаны обязательно и это будет подсказано на этапе написания кода
 * например попытка прочитать файл: при создании объекта FileReader, код не скомпилируется
 * пока мы не окружим его в блок try catch или не пробросим
 * исключение в сигнатуру метода.
 * Данное исключение известно на єтапе написания кода!!
 * <p>
 * unchecked exception - исключения о которых мы можем не подозревать и они проявят себя во время выполнения программы
 * в так наз. рантайме, например NullPointerException, при компиляции никто не подскажет, что в этом месте кода может быть проблема,
 * проблема которая положит приложения во время выполнения.
 * <p>
 * unchecked exception extends from RunTimeException
 * <p>
 * Exceptions in JDK - классы из станд библиотеки
 * Custom Exception - классы которые мы создаем самостоятельно
 * <p>
 * Для перехвата и обработки исключений исполь блок try catch
 *
 *
 * Если мы говорим про стандартные исключения(из библиотеки ), то проверяемые исключения обрабатываем конструкцией try catch,
 * а не проверяемые  - почти всегда можно обработать кодом
 */
public class ExceptionsExample {

    public static void main(String[] args) {
        exampleCheckedException();
        exampleUncheckedException(10,0);
        exampleUncheckedNPException(null);
    }

    private static void exampleCheckedException() {
        try {
            FileReader fileReader = new FileReader("// home");
        } catch (FileNotFoundException e) {
            System.out.println("Handle exception");
        }
    }

    private static void exampleUncheckedException(int a, int b) {
        if (b == 0) return;
        System.out.println(a / b);
        int i =  Integer.parseInt("55a");
    }
    private static void exampleUncheckedNPException(String str) {
        if(str == null) {
            System.out.println("String is null");
            return;
        }
       // try {
        System.out.println(str.length());

   // }catch (NullPointerException exception) {
          //  System.out.println("String is null");
      //  }

    }
}
