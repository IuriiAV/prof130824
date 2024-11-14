package com.telran.lesson4.passbyvalue;

public class StackExample {
        /*


       STACK : for method, primitive
       LIFO - Last input , first output

       | methodThree 4    | <-
       | methodTwo  3  5  | <-
       | methodOne  2  6 | <-
       |_main__1  7__| <-

     */
    // main -> код выполняется внутри каждого метода сверху вниз
    public static void main(String[] args) {
        System.out.println("1");
        methodOne();
        System.out.println("7");
    }

    public static void methodOne() {
        System.out.println("2");
        methodTwo();
        System.out.println("6");
    }

    public static void methodTwo() {
        System.out.println("3");
        methodThree();
        System.out.println("5");
    }

    public static void methodThree() {
        System.out.println("4");
    }
}
