import math.Calculator;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void initCalculator() {
        calc = new Calculator();
    }

    @Test
    public void testNfac() {
        assertEquals(1, calc.nfac(0));
        assertEquals(1, calc.nfac(1));
        assertEquals(2, calc.nfac(2));
        assertEquals(3628800, calc.nfac(10));
        assertEquals(2432902008176640000L, calc.nfac(20));
    }
}
