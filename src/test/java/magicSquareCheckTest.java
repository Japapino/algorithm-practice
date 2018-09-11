import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class magicSquareCheckTest {

    private int[][] msTest;

    @Before
    public void setup() {
        msTest = new int[][]{
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
    }

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
        MagicSquare test = new MagicSquare(msTest);
        boolean check = test.check();
        assertTrue(check);
    }

    @Test
    public void checkDifferencesBetweenGivenSquareAndMagicSquare(){
        int[][] array = new int[][]{
                {1,1,1},
                {1,1,1},
                {1,1,1}};
        MagicSquare test = new MagicSquare(array);
        int diff = test.checkDiff(msTest);
        assertThat(diff, is(36));
    }

    @Test
    public void shouldFindMagicSquareWithLowestDifference(){
        int[][] array = new int[][]{
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 1}};
        MagicSquare test = new MagicSquare(array);
        int result = test.findClosest(msTest);
        assertThat(result, is(0));
    }

    @Test
    public void shouldFindMagicSquareWithLowestDifference2(){
        int[][] array = new int[][]{
                {2,7,6},
                {9,5,1},
                {4,3,7}};
        MagicSquare test = new MagicSquare(array);
        int result = test.findClosest(msTest);
        assertThat(result, is(8));
    }


}
