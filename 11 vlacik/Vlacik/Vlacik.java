public class Vlacik {
    private SegmentVlaciku rusen;
    
    public Vlacik() {
        this.rusen = new SegmentVlaciku(TypSegmentu.RUSEN, new Pozicia(0, 0, Smer.VLAVO));
        SegmentVlaciku vagon1 = new SegmentVlaciku(
            TypSegmentu.VAGON_CERVENY,
            new Pozicia(1, 0, Smer.VLAVO)
        );
        this.rusen.pripoj(vagon1);
        SegmentVlaciku vagon2 = new SegmentVlaciku(
            TypSegmentu.VAGON_ZELENY,
            new Pozicia(2, 0, Smer.VLAVO)
        );
        vagon1.pripoj(vagon2);
        SegmentVlaciku vagon3 = new SegmentVlaciku(
            TypSegmentu.VAGON_MODRY,
            new Pozicia(3, 0, Smer.VLAVO)
        );
        vagon2.pripoj(vagon3);
    }
    
    public void posunDole() {
        this.rusen.posunSa(Smer.DOLE);
    }
    
    public void posunHore() {
        this.rusen.posunSa(Smer.HORE);
    }
    
    public void posunVlavo() {
        this.rusen.posunSa(Smer.VLAVO);
    }
    
    public void posunVpravo() {
        this.rusen.posunSa(Smer.VPRAVO);
    }
}
