package main.java;

import java.lang.reflect.Array;

public class algorithmRunner {

    public static void main(String[] args) {

        Algorithms test = new Algorithms;


        //Calculate the absolute difference between the diagonals of a matrix.


        int[] row1 = {1, 2, 3};
        int[] row2 = {1, 2, 3};
        int[] row3 = {1, 2, 3};
        int[][] array = {row1, row2, row3};

        int result = test.diagonalDiff(array);

        System.out.println(result);

    }
}
