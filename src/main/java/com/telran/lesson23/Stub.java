package com.telran.lesson23;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Stub {

    private String uuid = UUID.randomUUID().toString();

    private int[] arr = new int[100000000];


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stub stub = (Stub) o;
        return Objects.equals(uuid, stub.uuid) && Arrays.equals(arr, stub.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(uuid);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }
}
