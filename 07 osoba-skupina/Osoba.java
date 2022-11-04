public class Osoba {
    private String meno;
    private String priezvisko;

    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
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
}
