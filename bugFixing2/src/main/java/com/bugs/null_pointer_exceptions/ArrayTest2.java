package com.bugs.null_pointer_exceptions;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][];

        for (int i = 0; i <= matrix.length - 1; i++) {
            matrix[i] = new int[i + 1];
            for (int j = 0; j <= matrix[i].length - 1; j++) {
                matrix[i][j] = 1;
            }
        }

        //implements yours output according to the next style
        for (int[] matrix_ : matrix) {
            System.out.println(Arrays.toString(matrix_));
        }

    }
}
/*
[1]
[1, 1]
[1, 1, 1]
[1, 1, 1, 1]
[1, 1, 1, 1, 1]
 */