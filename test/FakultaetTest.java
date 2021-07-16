import fakultaet.Fakultaet;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FakultaetTest {

    private Fakultaet fakultaet;

    @Before
    public void initFakultaet() {
        fakultaet = new Fakultaet();
    }

    @Test
    public void testNfac() {
        assertEquals(1, fakultaet.nfac(0));
        assertEquals(1, fakultaet.nfac(1));
        assertEquals(2, fakultaet.nfac(2));
        assertEquals(3628800, fakultaet.nfac(10));
        assertEquals(2432902008176640000L, fakultaet.nfac(20));
    }
}
