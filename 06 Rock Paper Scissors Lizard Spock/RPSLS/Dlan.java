public class Dlan {
    private Obrazok gesto;
    private int aktualneGesto;
    
    public Dlan(int x) {
        this.gesto = new Obrazok("pics\\lizard.png");
        this.gesto.zobraz();
        this.gesto.zmenPolohu(x, 100);
        
        this.aktualneGesto = 0;
    }
    
    public void zmenGestoPodlaCisla(int gesto) {
        this.aktualneGesto = gesto;
        this.aktualizujGesto();
    }
    
    public void zmenNaDalsieGesto() {
        this.aktualneGesto = (this.aktualneGesto + 1) % 5;
        this.aktualizujGesto();
    }
    
    public void zmenNaPredchadzajuceGesto() {
        this.aktualneGesto = (this.aktualneGesto + 4) % 5;
        this.aktualizujGesto();
    }
    
    private void aktualizujGesto() {
        switch (this.aktualneGesto) {
            case 0:
                this.gesto.zmenObrazok("pics\\lizard.png");
                break;
            case 1:
                this.gesto.zmenObrazok("pics\\paper.png");
                break;
            case 2:
                this.gesto.zmenObrazok("pics\\rock.png");
                break;
            case 3:
                this.gesto.zmenObrazok("pics\\scissors.png");
                break;
            case 4:
                this.gesto.zmenObrazok("pics\\spock.png");
                break;
        }
    }
}
