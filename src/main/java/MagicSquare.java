import java.util.ArrayList;

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

        for (int z = 0 ; z < sums.size(); z++){
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

        for (int z = 0 ; z < sums.size(); z++){
            if (sums.get(z) != check){
                return false;
            }
        }
        return true;
    }

}
