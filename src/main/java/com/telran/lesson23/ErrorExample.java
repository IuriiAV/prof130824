package com.telran.lesson23;

/**
 *         Throwable
 * Error               Exception
 *
 * Error - ошибки уровня виртуальной машины, и нам не требуется их обрабатывать, у нас нет инструментов для их обработки
 * (в большинств случаев это вызвано некорректным кодом)
 * Пример
 * StackOverFlowError(SOF), OutofMemoryError(OOM)
 *
 * Exception - Исключения, возникающие во время работы приложения, которые мы можем и "должны" обрабатывать
 *
 */
public class ErrorExample {

    private static int count = 0;
    public static void main(String[] args) {
       // method();
    }

    public static void method() {
        //System.out.println(++count);
        //method();
//        Map<Stub,Stub> map = new HashMap<>();
//        while (true){
//            System.out.println(++count);
//            map.put(new Stub(),new Stub());
    //    }
    }
}
