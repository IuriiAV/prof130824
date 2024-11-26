/*5.у вас есть список значений String , и вы должны вернуть одну строку ,
 которая представляет собой конкатенацию всех значений.
 */

package com.telran.h3.fifth;

import java.util.ArrayList;
import java.util.List;

public class Concatenation {

    public static String concationedList(List<String> originalList) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < originalList.size(); i++) {
            result.append(originalList.get(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {

        //List<String> originalList = buildList();

        System.out.println("The concantenated list is: " + concationedList(buildList()));
    }

    private static List<String> buildList() {
        List<String> originalList = new ArrayList<>();

        originalList.add("Bob|");
        originalList.add("John|");
        originalList.add("Samuel|");
        originalList.add("Karin");

        return originalList;
    }
}


