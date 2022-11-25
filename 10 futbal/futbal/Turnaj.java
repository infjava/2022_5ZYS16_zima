public class Turnaj {
    private Tim[] timy;
    private VysledokZapasu[][] vysledky;
    
    public Turnaj(Tim[] timy) {
        this.timy = timy;
        
        this.vysledky = new VysledokZapasu[timy.length][timy.length];
        
        for (int riadok = 0; riadok < timy.length; riadok++) {
            for (int stlpec = 0; stlpec < timy.length; stlpec++) {
                if (riadok == stlpec) {
                    this.vysledky[riadok][stlpec] = VysledokZapasu.NEZMYSEL;
                } else {
                    this.vysledky[riadok][stlpec] = VysledokZapasu.NEHRAL_SA;
                }
            }
        }
    }
    
    public void vypisVysledky() {
        System.out.format("%10s", "");
        for (Tim tim : this.timy) {
            System.out.format("%10s", tim.getNazov());
        }
        System.out.println();
        
        for (int riadok = 0; riadok < timy.length; riadok++) {
            System.out.format("%10s", this.timy[riadok].getNazov());
            for (int stlpec = 0; stlpec < timy.length; stlpec++) {
                System.out.format("%10s", this.vysledky[riadok][stlpec]);
            }
            System.out.println();
        }
    }
    
    public void vlozVysledok(String domaci, String hostia, VysledokZapasu vysledokDomaci) {
        int indexDomaci = this.getIndexTimu(domaci);
        int indexHostia = this.getIndexTimu(hostia);
        
        if (indexDomaci == -1 || indexHostia == -1) {
            System.out.println("Nespravny nazov timu");
            return;
        }
        
        VysledokZapasu vysledokHostia = vysledokDomaci.getOpacny();
        
        this.vysledky[indexDomaci][indexHostia] = vysledokDomaci;
        this.vysledky[indexHostia][indexDomaci] = vysledokHostia;
        
        this.timy[indexDomaci].pridajBody(vysledokDomaci.getPocetBodov());
        this.timy[indexHostia].pridajBody(vysledokHostia.getPocetBodov());
    }
    
    private int getIndexTimu(String nazov) {
        for (int i = 0; i < this.timy.length; i++) {
            if (this.timy[i].getNazov().equals(nazov)) {
                return i;
            }
        }
        
        return -1;
    }
}
