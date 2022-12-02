public class SegmentVlaciku {
    private final TypSegmentu typ;
    private Pozicia pozicia;
    private final Obrazok obrazok;
    private SegmentVlaciku pripojeny;
    
    public SegmentVlaciku(TypSegmentu typ, Pozicia pozicia) {
        this.typ = typ;
        this.pozicia = pozicia;
        this.obrazok = new Obrazok(typ.getCestaKObrazku());
        this.obrazok.posunVodorovne(-100 + pozicia.getX() * 35);
        this.obrazok.posunZvisle(-100 + pozicia.getY() * 35);
        this.obrazok.zmenUhol(pozicia.getSmer().getUhol());
        this.obrazok.zobraz();
        this.pripojeny = null;
    }
    
    public void pripoj(SegmentVlaciku dalsi) {
        this.pripojeny = dalsi;
    }
    
    public void posunSa(Smer smer) {
        if (this.pripojeny != null) {
            this.pripojeny.posunSa(this.pozicia.getSmer());
        }
        
        Pozicia nova = this.pozicia.posun(smer);
        
        this.obrazok.posunVodorovne((nova.getX() - this.pozicia.getX()) * 35);
        this.obrazok.posunZvisle((nova.getY() - this.pozicia.getY()) * 35);
        this.obrazok.zmenUhol(nova.getSmer().getUhol());
        
        this.pozicia = nova;
    }
}
