import java.util.ArrayList;
import java.util.Arrays;

public class MagicSquare {

    //stores all possible 3x3 magic squares
    int[][] array;

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

    public int checkDiff(int[][] testArray){
        int size = testArray.length;
        int[][] test = this.array;
        int[][] result = new int[size][size];
        int sumDiff = 0;

        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                result[i][j] = testArray[i][j] - test[i][j];
            }
        }

        for (int[] row : result){
            for (int x : row){
                sumDiff += x;
            }
        }

        return sumDiff;
    }


}
