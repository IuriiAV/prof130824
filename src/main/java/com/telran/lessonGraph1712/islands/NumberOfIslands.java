package com.telran.lessonGraph1712.islands;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1 1 0 0 0
 * 0 1 0 0 1
 * 1 0 0 1 1
 * 0 0 0 0 0
 * 1 0 1 0 1
 */
public class NumberOfIslands {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    bfs(arr, i, j);
                    count++;
                }
            }
        }
    }

    private static void bfs(int[][] arr, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        while (queue.isEmpty()){
            int[] poll = queue.poll();
            int row = poll[0];
            int col = poll[1];

        }
    }
}
