public class Hrac {
    private Dlan dlan;
    
    public Hrac(Dlan dlan) {
        this.dlan = dlan;
    }
    
    public void posunVlavo() {
        this.dlan.zmenNaPredchadzajuceGesto();
    }
    
    public void posunVpravo() {
        this.dlan.zmenNaDalsieGesto();
    }
}
