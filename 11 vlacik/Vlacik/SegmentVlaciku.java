public class SegmentVlaciku {
    private final TypSegmentu typ;
    private Pozicia pozicia;
    private final Obrazok obrazok;
    
    public SegmentVlaciku(TypSegmentu typ, Pozicia pozicia) {
        this.typ = typ;
        this.pozicia = pozicia;
        this.obrazok = new Obrazok(typ.getCestaKObrazku());
        this.obrazok.posunVodorovne(-100 + pozicia.getX() * 35);
        this.obrazok.posunZvisle(-100 + pozicia.getY() * 35);
        this.obrazok.zmenUhol(pozicia.getSmer().getUhol());
        this.obrazok.zobraz();
    }
}
