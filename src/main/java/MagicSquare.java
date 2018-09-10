import java.util.ArrayList;
import java.util.Arrays;

public class MagicSquare {

    //stores all possible 3x3 magic squares
    int[][] array;
    ArrayList<MagicSquare> squareList = new ArrayList<>();

    public MagicSquare(int[][] array){
        this.array = array;
    }

    public int[][] getSquare(){
        return array;
    }


    public boolean checkRows(){
        int sum;
        ArrayList<Integer> sums = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            sum = 0;
            for (int j = 0; j < array.length; j++){
                sum += array[i][j];
            }

            sums.add(sum);
        }


        int check = sums.get(0);

        for (int z = 0; z < sums.size(); z++){
            if (sums.get(z) != check){
                return false;
            }
        }

        return true;
    }

    public boolean checkColumns(){
        int sum;
        ArrayList<Integer> sums = new ArrayList<>();

        for (int j = 0; j < array.length; j++){
            sum = 0;
            for (int i = 0; i < array.length; i++){
                sum += array[i][j];
            }
            sums.add(sum);
        }

        int check = sums.get(0);

        for (int z = 0; z < sums.size(); z++){
            if (sums.get(z) != check){
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagonal(){
        int sum;
        ArrayList<Integer> sums = new ArrayList<>();

        //first diagonal
        sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i][i];
        }
        sums.add(sum);

        //second diagonal
        int j = array.length-1;
        sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i][j];
            if (j!= 0) {
                j--;
            }
        }
        sums.add(sum);

        int check = sums.get(0);

        for (int z = 0; z < sums.size(); z++){
            if (sums.get(z) != check){
                return false;
            }
        }
        return true;
    }

    public boolean check(){

        if (this.checkRows()  && this.checkColumns() && this.checkDiagonal() ) {
            return true;
        }
        return false;
    }

    public int checkDiff(int[][] checkArray){
        int size = checkArray.length;
        int[][] test = this.array;
        int[][] result = new int[size][size];
        int sumDiff = 0;

        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                result[i][j] = checkArray[i][j] - test[i][j];
            }
        }

        for (int[] row : result){
            for (int x : row){
                sumDiff += x;
            }
        }

        return sumDiff;
    }

    public int[][] findClosest(int[][] arrayToCheck){
        int[][] array;
        int difference;
        int leastDifference = Integer.MAX_VALUE;
        int[][] closestArray = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
        for(MagicSquare ms : squareList) {
//            array = ms.getSquare();

            difference = ms.checkDiff(arrayToCheck);
            if (difference < leastDifference){
                leastDifference = difference;
                closestArray = ms.getSquare();
            }
        }

        return closestArray;
    }

    public void magicSquares(){
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


        squareList.add(magic1);
        squareList.add(magic2);
        squareList.add(magic3);
        squareList.add(magic4);
        squareList.add(magic5);
        squareList.add(magic6);
        squareList.add(magic7);
        squareList.add(magic8);
    }


}
