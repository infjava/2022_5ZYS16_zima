public enum Smer {
    HORE,
    DOLE,
    VLAVO,
    VPRAVO;
    
    public int getUhol() {
        switch (this) {
            case HORE:
                return 90;
            case DOLE:
                return 270;
            case VLAVO:
                return 0;
            case VPRAVO:
                return 180;
            default:
                return 0;
        }
    }
}
