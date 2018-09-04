import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class stackTest {

    @Test
    public void shouldHoldASetOfValues(){
        int[] test = new int[] {1,2,3};
        IntStack testIntStack = new IntStack();
        testIntStack.push(1);
        testIntStack.push(2);
        testIntStack.push(3);
        asserThat(testIntStack.size(), is(3));

    }
}
