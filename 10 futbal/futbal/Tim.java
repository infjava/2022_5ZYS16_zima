public class Tim {
    private Stat stat;
    private String nazov;
    private int pocetBodov;
    
    public Tim(Stat stat, String nazov) {
        this.stat = stat;
        this.nazov = nazov;
        this.pocetBodov = 0;
    }
    
    public Stat getStat() {
        return this.stat;
    }
    
    public String getNazov() {
        return this.nazov;
    }
    
    public int getPocetBodov() {
        return this.pocetBodov;
    }
    
    public void pridajBody(int kolko) {
        this.pocetBodov += kolko;
        // this.pocetBodov = this.pocetBodov + kolko;
    }
}
