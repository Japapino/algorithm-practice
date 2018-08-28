import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertTrue;

public class magicSquareCheckTest {



    @Test
    public void checkIfSumOfAllRowsAreEqual(){
        int[][] array = new int[][]{
                {-1,1,1},
                {-1,1,1},
                {-1,1,1}};
        MagicSquare test = new MagicSquare(array);
        boolean check = test.checkRows();
        assertTrue(check);
    }

    @Test
    public void checkIfSumOfAllColumnsAreEqual(){
        int[][] array = new int[][]{
                {-1,-1,-1},
                {1,1,1},
                {1,1,1}};
        MagicSquare test = new MagicSquare(array);
        boolean check = test.checkColumns();
        assertTrue(check);
    }

    @Test
    public void checkIfSumOfDiagonalsAreEqual(){
        int[][] array = new int[][]{
                {-1,1,-1},
                {1,1,1},
                {-1,1,-1}};
        MagicSquare test = new MagicSquare(array);
        boolean check = test.checkDiagonal();
        assertTrue(check);
    }

}
