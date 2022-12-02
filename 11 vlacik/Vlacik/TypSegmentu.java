public enum TypSegmentu {
    RUSEN("vlak.png"),
    VAGON_ZELENY("vagon03.png"),
    VAGON_MODRY("vagon01.png"),
    VAGON_CERVENY("vagon02.png");
    
    private String nazovObrazku;
    
    TypSegmentu(String nazovObrazku) {
        this.nazovObrazku = nazovObrazku;
    }
    
    public String getCestaKObrazku() {
        return "pics/" + this.nazovObrazku;
    }
}
