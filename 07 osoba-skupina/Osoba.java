import java.util.ArrayList;

public class Osoba {
    private String meno;
    private String priezvisko;
    private ArrayList<Double> body;

    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.body = new ArrayList<Double>();
    }
    
    public void pridajHodnotenie(double body) {
        this.body.add(body);
    }
    
    public double getMaximalneBody() {
        double maximum = Double.NEGATIVE_INFINITY;
        for (double body : this.body) {
            if (body > maximum) {
                maximum = body;
            }
        }
        
        return maximum;
    }

    public String getMeno() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }

    public void vypis() {
        System.out.println(this.meno + " " + this.priezvisko);
    }
    
    public boolean equals(Osoba druha) {
        return this.meno.equals(druha.getMeno())
                && this.priezvisko.equals(druha.getPriezvisko());
    }
    
    public String getInicialky() {
        return new StringBuilder()
            .append(this.meno.charAt(0))
            .append(this.priezvisko.charAt(0))
            .toString();
    }
}
