public enum Smer {
    HORE(90),
    DOLE(270),
    VLAVO(0),
    VPRAVO(180);
    
    private int uhol;
    
    Smer(int uhol) {
        this.uhol = uhol;
    }
    
    public int getUhol() {
        return this.uhol;
    }
}
