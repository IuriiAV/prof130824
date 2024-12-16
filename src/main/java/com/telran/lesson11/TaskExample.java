package com.telran.lesson11;

import java.util.Stack;

public class TaskExample {

    public static void main(String[] args) {
        //1 Short kbceffecbh -> kbceecbh -> kbccbh -> kbbh -> kh

        //2 Soliter

        //3 Calculator (3+5) * 2 - 7 POLIZ

        Stack<Character> stack = new Stack<>();
        String text = "kbceffecbh";
        for (int i = 0; i < text.length(); i++) { //0,1,2,3,4,5,6,7,8,9
            char element = text.charAt(i); // k ,b, c, e, f,f,e,c,b,h
            if (stack.isEmpty()) {
                stack.push(element); // +k
            } else {
                char peek = stack.peek(); // k ,b , c ,e , f ,e , c, b, k
                if (peek == element) { // k!=b, b!=c, c!=e, e!=f, f==f, e==e ,c == c, b==b, k!=h
                    stack.pop(); // k,  b , c, e , -f // // k
                } else {
                    stack.push(element); // k,  b , c, e , f // k +h
                }
            }
        }
        // k,h
        System.out.println(stack);
    }
}
