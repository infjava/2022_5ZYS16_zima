

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KalkulackaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KalkulackaTest {
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        
    }
    
    @Test
    public void nastavenieOperandu10() {
        Kalkulacka kalkulacka = new Kalkulacka();
        kalkulacka.zadajCislo(10);
        Assert.assertEquals(10, kalkulacka.getOperand(), 0.0001);
    }
    
    @Test
    public void vypocet2Plus3() {
        Kalkulacka kalkulacka = new Kalkulacka();
        kalkulacka.zadajCislo(2);
        kalkulacka.zadajOperaciu('+');
        kalkulacka.zadajCislo(3);
        kalkulacka.zadajOperaciu('=');
        Assert.assertEquals(5, kalkulacka.getVysledok(), 0.0001);
    }
    
    @Test
    public void vypocet2Krat3() {
        Kalkulacka kalkulacka = new Kalkulacka();
        kalkulacka.zadajCislo(2);
        kalkulacka.zadajOperaciu('*');
        kalkulacka.zadajCislo(3);
        kalkulacka.zadajOperaciu('=');
        Assert.assertEquals(6, kalkulacka.getVysledok(), 0.0001);
    }
}

