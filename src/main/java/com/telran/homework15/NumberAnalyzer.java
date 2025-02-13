package com.telran.homework15;

import java.util.Collections;
import java.util.List;

public class NumberAnalyzer {

    public int findMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list is null or empty");
        }
        return Collections.max(numbers);
    }

    public int findMin(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list is null or empty");
        }
        return Collections.min(numbers);
    }

    public double findAvg(List<Integer> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("The list is null");
        }
        return numbers.stream().mapToInt(Integer::intValue).average().orElseThrow(
                () -> new IllegalArgumentException("The list is empty")
        );
    }
}
