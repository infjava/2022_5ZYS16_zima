public enum VysledokZapasu {
    NEHRAL_SA(0),
    NEZMYSEL(0),
    ZRUSENY(0),
    REMIZA(1),
    VYHRA(3),
    PREHRA(0);
    
    private int pocetBodov;
    
    VysledokZapasu(int pocetBodov) {
        this.pocetBodov = pocetBodov;
    }
    
    public int getPocetBodov() {
        return this.pocetBodov;
    }
}
