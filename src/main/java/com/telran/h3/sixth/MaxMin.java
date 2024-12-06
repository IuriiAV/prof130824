/*6.у вас есть список значений int и
вы должны вернуть их максимум или минимум
 */

package com.telran.h3.sixth;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {

        List<Integer> originalList = new ArrayList<>();
        originalList.add(5);

        originalList.add(10);

        originalList.add(54);

        originalList.add(75);

        originalList.add(9);

        int minInt = originalList.get(0).intValue();
        int maxInt = originalList.get(0).intValue();
        int number = 0;
        int number1 = 0;

        for (int i = 0; i < originalList.size(); i++) {
            if (originalList.get(i).intValue() < minInt) {
                minInt = originalList.get(i).intValue();
                number = i;
            }
        }

        for (int i = 0; i < originalList.size(); i++) {
            if (originalList.get(i).intValue() > maxInt) {
                maxInt = originalList.get(i).intValue();
                number1 = i;
            }
        }

        System.out.println("Number " + number + " " + originalList.get(number) + " is the minimal value.");
        System.out.println("Number  " + number1 + " " + originalList.get(number1) + " is the maximal value.");
    }
}
