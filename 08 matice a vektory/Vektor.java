public class Vektor {
    private int[] vektor;
    
    public Vektor(int[] prvky) {
        this.vektor = prvky;
    }
    
    public int get(int index) {
        return this.vektor[index];
    }
    
    public int size() {
        return this.vektor.length;
    }
    
    public int skalarnySucin(Vektor druhyVektor) {
        if (this.vektor.length != druhyVektor.size()) {
            System.out.println("Vektory musia mat rovnaky rozmer");
            return 0;
        }
        
        int vysledok = 0;
        
        for (int i = 0; i < this.vektor.length; i++) {
            int prvokZPrveho = this.vektor[i];
            int prvokZDruheho = druhyVektor.get(i);
            
            vysledok = vysledok + prvokZPrveho * prvokZDruheho;
        }
        
        return vysledok;
    }
    
    public Vektor sucet(Vektor druhyVektor) {
        if (this.vektor.length != druhyVektor.size()) {
            System.out.println("Vektory musia mat rovnaky rozmer");
            return null;
        }
        
        int[] vysledok = new int[this.vektor.length];
        
        for (int i = 0; i < this.vektor.length; i++) {
            int prvokZPrveho = this.vektor[i];
            int prvokZDruheho = druhyVektor.get(i);
            
            vysledok[i] = prvokZPrveho + prvokZDruheho;
        }
        
        return new Vektor(vysledok);
    }
}
