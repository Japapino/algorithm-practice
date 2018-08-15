

public class algorithmRunner {

    public static void main(String[] args) {

        Algorithms test = new Algorithms();


        //Calculate the absolute difference between the diagonals of a matrix.


//        int[][] array = new int[3][3];

        int[][] array = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };



        int result = test.diagonalDiff(array);

        System.out.println(result);

    }
}
