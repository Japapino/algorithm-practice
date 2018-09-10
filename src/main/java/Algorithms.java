import java.util.ArrayList;

public class Algorithms {

    public int diagonalDiff(int[][] array){

        int diagSum1 = 0;
        int diagSum2 = 0;


        //first diagonal sum;
        for (int i = 0; i < array.length; i++){
            diagSum1 += array[i][i];
        }

        //second diagonal sum;
        int row = 0;
        for (int j = array.length-1; j >= 0; j--){
            diagSum2 += array[j][row];
            row++;
        }

        int diagDiff = diagSum1 - diagSum2;

        return Math.abs(diagDiff);

    }

    public int magicSquare(int[][] s){



        //check if matrix is a magic square where the sum of any
        //row, column, or diagonal are all equal.

        //values in the square are between 1 and 9

        //if it is not, transform it into magic square at minimal cost.

        //A value of the in the matrix (x) can be changed to another value (y)
        //at the cost of the difference between the two: abs(x-y);

        return 0;
    }


}
