public class Displej {
    public Displej(int sirka, int vyska, int sirkaPolicka) {
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                PolickoDispleja pd = new PolickoDispleja(
                    x * sirkaPolicka,
                    y * sirkaPolicka,
                    sirkaPolicka
                );
            }
        }
    }
    
    public void zobrazZasahLode(int x, int y) {
        
    }
    
    public void zobrazZasahVody(int x, int y) {
        
    }
}
