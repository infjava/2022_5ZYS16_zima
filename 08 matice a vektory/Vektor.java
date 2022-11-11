public class Vektor {
    private int[] vektor;
    
    public Vektor(int pocetPrvkov) {
        this.vektor = new int[pocetPrvkov];
    }
    
    public void nastavPrvok(int index, int hodnota) {
        this.vektor[index] = hodnota;
    }
}
