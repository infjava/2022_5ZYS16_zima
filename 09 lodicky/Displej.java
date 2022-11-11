public class Displej {
    private PolickoDispleja[][] policka;
    
    public Displej(int sirka, int vyska, int sirkaPolicka) {
        this.policka = new PolickoDispleja[vyska][sirka];
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                PolickoDispleja pd = new PolickoDispleja(
                    x * sirkaPolicka,
                    y * sirkaPolicka,
                    sirkaPolicka
                );
                this.policka[y][x] = pd;
            }
        }
    }
    
    public void zobrazZasahLode(int x, int y) {
        this.policka[y][x].zobrazZasahLode();
    }
    
    public void zobrazZasahVody(int x, int y) {
        this.policka[y][x].zobrazZasahVody();
    }
}
