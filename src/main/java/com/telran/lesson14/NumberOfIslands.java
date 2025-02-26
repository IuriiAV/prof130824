package com.telran.lesson14;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 1  1  0  0  0                        1 1
 * 0  1  0  0  1                          1
 * 1  0  0  1  1                        1
 * 0  0  0  0  0
 * 1  0  1  0  1
 */
public class NumberOfIslands {

    public static void main(String[] args) {
        int[][] array = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    bfs(array, i, j);
                    count++;
                }
            }
        }
        System.out.println("Number of islands = " + count);
    }

    private static void bfs(int[][] array, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int row = poll[0];
            int col = poll[1];
            if (row < 0 || row >= array.length || col < 0 || col >= array[i].length) {
                continue;
            }
            if (array[row][col] == 0) {
                continue;
            }
            array[row][col] = 0;

            queue.add(new int[]{row, col + 1});
            queue.add(new int[]{row, col - 1});
            queue.add(new int[]{row + 1, col});
            queue.add(new int[]{row - 1, col});
        }
    }
}
