import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
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

    @Test
    public void runAllMagicSquareChecksShouldBeFalse(){
        int[][] array = new int[][]{
                {-1,1,-1},
                {1,1,1},
                {-1,1,-1}};
        MagicSquare test = new MagicSquare(array);
        boolean check = test.check();
        assertFalse(check);
    }

    @Test
    public void runAllMagicSquareChecksShouldBeTrue(){
        int[][] array = new int[][]{
                {8,1,6},
                {3,5,7},
                {4,9,2}
        };
        MagicSquare test = new MagicSquare(array);
        boolean check = test.check();
        assertTrue(check);
    }

}
