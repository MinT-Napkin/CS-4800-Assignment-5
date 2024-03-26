import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {

    @Test
    public void testSum() {
        int a = 3;
        int b = 4;
        int expectedSum = 7;
        int actualSum = MyClass.sum(a, b);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumFail() {
        int a = 2;
        int b = 4;
        int expectedSum = 7;
        int actualSum = MyClass.sum(a, b);
        assertEquals(expectedSum, actualSum);
    }
}