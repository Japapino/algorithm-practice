import java.util.ArrayList;

public class Algorithms {

    public int diagonalDiff(int[][] array){

        int diagSum1 = 0;
        int diagSum2 = 0;


        //first diagonal sum;
        for (int i = 0; i < array.length; i++){
            diagSum1 += array[i][i];
        }

        System.out.println("Fist Diagonal Sum: " + diagSum1);
        //second diagonal sum;
        int row = 0;
        for (int j = array.length-1; j >= 0; j--){
            diagSum2 += array[j][row];
            row++;
        }
        System.out.println("Second Diagonal Sum: " + diagSum2);

        int diagDiff = diagSum1 - diagSum2;

        return Math.abs(diagDiff);

    }

    public int magicSquare(int[][] s){

        //all possible 3x3 magic squares
        int[][] ms1 = new int[][]{
                {8,1,6},
                {3,5,7},
                {4,9,2}
        };

        int[][] ms2 = new int[][]{
                {6,1,8},
                {7,5,3},
                {2,9,4}
        };
        int[][] ms3 = new int[][]{
                {4,9,2},
                {3,5,7},
                {8,1,6}
        };
        int[][] ms4 = new int[][]{
                {2,9,4},
                {7,5,3},
                {6,1,8}
        };
        int[][] ms5 = new int[][]{
                {8,3,4},
                {1,5,9},
                {6,7,2}
        };
        int[][] ms6 = new int[][]{
                {4,3,8},
                {9,5,1},
                {2,7,6}
        };
        int[][] ms7 = new int[][]{
                {6,7,2},
                {1,5,9},
                {8,3,4}
        };
        int[][] ms8 = new int[][]{
                {2,7,6},
                {9,5,1},
                {4,3,8}
        };

        MagicSquare magic1 = new MagicSquare(ms1);
        MagicSquare magic2 = new MagicSquare(ms2);
        MagicSquare magic3 = new MagicSquare(ms3);
        MagicSquare magic4 = new MagicSquare(ms4);
        MagicSquare magic5 = new MagicSquare(ms5);
        MagicSquare magic6 = new MagicSquare(ms6);
        MagicSquare magic7 = new MagicSquare(ms7);
        MagicSquare magic8 = new MagicSquare(ms8);

        ArrayList<MagicSquare> squareList = new ArrayList<>();
        squareList.add(magic1);
        squareList.add(magic2);
        squareList.add(magic3);
        squareList.add(magic4);
        squareList.add(magic5);
        squareList.add(magic6);
        squareList.add(magic7);
        squareList.add(magic8);

        //check if matrix is a magic square where the sum of any
        //row, column, or diagonal are all equal.

        //values in the square are between 1 and 9

        //if it is not, transform it into magic square at minimal cost.

        //A value of the in the matrix (x) can be changed to another value (y)
        //at the cost of the difference between the two: abs(x-y);

        return 0;
    }


}
