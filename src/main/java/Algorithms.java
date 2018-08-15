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


        
        return 0;
    }


}
