import java.util.ArrayList;

public class Skupina {
    private ArrayList<Osoba> osoby;
        
    public Skupina() {
        this.osoby = new ArrayList<Osoba>();
    }
    
    public void pridajObjektOsoba(Osoba novaOsoba) {
        if (!this.jeClenomSkupiny(novaOsoba)) {
            this.osoby.add(novaOsoba);
        }
    }
    
    public void pridajNovuOsobu(String noveMeno, String novePriezvisko) {
        Osoba nova = new Osoba(noveMeno, novePriezvisko);
        this.pridajObjektOsoba(nova);
    }
    
    public boolean jeClenomSkupiny(Osoba hladanaOsoba) {
        for (Osoba osoba : this.osoby) {
            if (osoba.equals(hladanaOsoba)) {
                return true;
            }
        }
        return false;
    }
        
    public int getPocetClenovSkupiny() {
        return this.osoby.size();
    }
        
    public void vypisClenovSkupiny() {
        for (Osoba osoba : this.osoby) {
            osoba.vypis();
        }
    }
    
    public void odstranPodlaPoradia(int poradie) {
        this.osoby.remove(poradie);
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        this.osoby.remove(osoba);
    }
    
    public void zrusSkupinu() {
        this.osoby.clear();
    }
    
    public void vypisOsobySInicialkami(String inicialky) {
        for (Osoba osoba : this.osoby) {
            if (osoba.getInicialky().equals(inicialky)) {
                osoba.vypis();
            }
        }
    }
}
