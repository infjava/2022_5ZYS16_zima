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
}
