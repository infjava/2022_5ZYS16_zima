

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
    private Kalkulacka kalkulacka;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        this.kalkulacka = new Kalkulacka();
    }
    
    @Test
    public void nastavenieOperandu10() {
        this.kalkulacka.zadajCislo(10);
        Assert.assertEquals(10, this.kalkulacka.getOperand(), 0.0001);
    }
    
    @Test
    public void vypocet2Plus3() {
        this.kalkulacka.zadajCislo(2);
        this.kalkulacka.zadajOperaciu('+');
        this.kalkulacka.zadajCislo(3);
        this.kalkulacka.zadajOperaciu('=');
        Assert.assertEquals(5, this.kalkulacka.getVysledok(), 0.0001);
    }
    
    @Test
    public void vypocet2Krat3() {
        this.kalkulacka.zadajCislo(2);
        this.kalkulacka.zadajOperaciu('*');
        this.kalkulacka.zadajCislo(3);
        this.kalkulacka.zadajOperaciu('=');
        Assert.assertEquals(6, this.kalkulacka.getVysledok(), 0.0001);
    }
}

