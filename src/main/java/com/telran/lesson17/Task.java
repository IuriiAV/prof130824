package com.telran.lesson17;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{17,18,15},{7,9,25}};
        Stream<int[]> stream = Arrays.stream(array);
        stream.flatMapToInt(a-> Arrays.stream(a)).forEach(s -> System.out.print(s +  " "));
    }
}
