import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    public void testFib1() {
        Assertions.assertEquals(1 , Calculator.my_fact(1));
    }

    @Test
    public void testFib2() {
        Assertions.assertEquals(6, Calculator.my_fact(3));
    }

    @Test
    public void testFact3() {
        Assertions.assertEquals(120, Calculator.my_fact(5));
    }
}
