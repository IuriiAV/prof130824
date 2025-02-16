package com.telran.lesson23;

import java.util.HashMap;
import java.util.Map;

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
 *  подсказано на этапе написания кода, например попытка прочитать файл, при создании объекта
 *  FileReader, код не скомпилируется, пока мы не окружим его в блок try-catch или не пробросим
 *  исключение в сигнатуру метода
 *  Данное исключение известно на этапе написания кода!!
 *
 *  unchecked exception - исключения о которых мы можем не подозревать и они проявят себя во время
 *  выполнения программы, в тн рантайме, например NullPointerException, при компиляции никто не
 *  подскажет что в этом месте кода может быть проблема, проблема которая положит приложение во
 *  время выполнения
 *
 *  unchecked exceptions extends from RuntimeException
 *
 *  Exceptions in JDK
 */
public class ErrorExample {

    private static int count = 0;

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Map<Stub, Stub> map = new HashMap<>();
       while(true) {
           System.out.println(++count);
           map.put(new Stub(), new Stub());
       }
    }
}
