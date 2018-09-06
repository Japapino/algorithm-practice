import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class stackTest {

    private IntStack testStack = new IntStack();

    @Test
    public void shouldHaveSize(){
        assertThat(testStack.size(), is(10));
    }

    @Test
    public void shouldInsertAndRetrieveValues(){
        IntStack testStack = new IntStack();
        testStack.push(3);
        assertThat(testStack.pop(), is(3));
    }

    @Test
    public void shouldReturnFalseIfStackFull(){
        intStacktestStack = new IntStack(2);
        testStack.push(1);
        testStack.push(2);
        boolean result = testStack.push(3);
        assertFalse(result);

    }
}
