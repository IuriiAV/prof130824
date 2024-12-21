package com.telran.lessonGraph1712.islands;

import java.util.Arrays;
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

        System.out.println(Arrays.deepToString(arr));

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    bfs(arr, i, j);
                    count++;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    private static void bfs(int[][] arr, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        while (queue.isEmpty()){
            int[] poll = queue.poll();
            int row = poll[0];
            int col = poll[1];
            if(row < 0 || row >= arr.length || col < 0 || col >= arr[i].length){
                continue;
            }
            if(arr[row][col] == 0){
                continue;
            }

            arr[row][col] = 0;



        }
    }
}
