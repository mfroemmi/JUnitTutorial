import calculator.Standard;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Standard standard;

    @Before
    public void initStandard () {standard = new Standard(1, 1);}

    @Test
    public void testOpAdd() {
        assertEquals(2, standard.opAdd(), 0.0f);
        assertEquals(0, standard.opSub(), 0.0f);
        standard.setNum1(1234);
        standard.setNum2(4321);
        assertEquals(5555, standard.opAdd(), 0.0f);
        assertEquals(-3087, standard.opSub(), 0.0f);
    }
}
