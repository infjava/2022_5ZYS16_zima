public class Pozicia {
    private final int x;
    private final int y;
    private final Smer smer;
    
    public Pozicia(int x, int y, Smer smer) {
        this.x = x;
        this.y = y;
        this.smer = smer;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Smer getSmer() {
        return this.smer;
    }
    
    public Pozicia posun(Smer smer) {
        return new Pozicia(
            this.x + smer.getZmenaX(),
            this.y + smer.getZmenaY(),
            smer
        );
    }
}
