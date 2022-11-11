public class Matica {
    private int[][] matica;
    
    public Matica(int sirka, int vyska) {
        this.matica = new int[vyska][sirka];
    }
    
    public void nastavPrvok(int stlpec, int riadok, int hodnota) {
        this.matica[riadok][stlpec] = hodnota;
    }
}
