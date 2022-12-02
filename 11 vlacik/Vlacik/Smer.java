public enum Smer {
    HORE(90, 0, -1),
    DOLE(270, 0, 1),
    VLAVO(0, -1, 0),
    VPRAVO(180, 1, 0);
    
    private final int uhol;
    private final int zmenaX;
    private final int zmenaY;
    
    Smer(int uhol, int zmenaX, int zmenaY) {
        this.uhol = uhol;
        this.zmenaX = zmenaX;
        this.zmenaY = zmenaY;
    }
    
    public int getUhol() {
        return this.uhol;
    }
    
    public int getZmenaX() {
        return this.zmenaX;
    }
    
    public int getZmenaY() {
        return this.zmenaY;
    }
}
