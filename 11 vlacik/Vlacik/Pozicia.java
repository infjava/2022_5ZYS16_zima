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
        switch (smer) {
            case VLAVO:
                return new Pozicia(this.x - 1, this.y, smer);
            case VPRAVO:
                return new Pozicia(this.x + 1, this.y, smer);
            case HORE:
                return new Pozicia(this.x, this.y - 1, smer);
            case DOLE:
                return new Pozicia(this.x, this.y + 1, smer);
            default:
                return this;
        }
    }
}
