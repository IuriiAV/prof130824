/*7.у вас есть список String
и вы должны вернуть максимальную длину*/

package com.telran.h3.maxString;

import java.util.ArrayList;
import java.util.List;

public class MaxString {

    public static void main(String[] args) {

        List<String> Str = new ArrayList<>();
        Str.add("Max");
        Str.add("Kokoko");
        Str.add("mhfuem");
        Str.add("ndhvdksl");
        Str.add("dbdy");

        int largestString = Str.get(0).length();
        int index = 0;

        for (int i = 0; i < Str.size(); i++) {
            if (Str.get(i).length() > largestString) {
                largestString = Str.get(i).length();
                index = i;
            }
        }
        System.out.println("Index " + index + " is the largest and is size " + largestString);
    }
}
