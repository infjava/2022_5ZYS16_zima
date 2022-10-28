import java.util.Random;

public class Pocitac {
    private Dlan dlan;
    private Random nahodneCisla;
    
    public Pocitac(Dlan dlan) {
        this.dlan = dlan;
        this.nahodneCisla = new Random();
    }
    
    public void tik() {
        int gesto = this.nahodneCisla.nextInt(5);
        this.dlan.zmenGestoPodlaCisla(gesto);
    }
}
