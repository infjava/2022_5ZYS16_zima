public class Osoba {
    private String meno;
    private String priezvisko;
    private String datumNarodenia;
    
    public Osoba(String meno, String priezvisko, String datumNarodenia) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.datumNarodenia = datumNarodenia;
    }
    
    public String getMeno() {
        return this.meno;
    }
    
    public String getPriezvisko() {
        return this.priezvisko;
    }
    
    public String getDatumNarodenia() {
        return this.datumNarodenia;
    }
    
    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }
    
    public void vypisDoTerminalu() {
        System.out.print("Meno: ");
        System.out.print(this.meno);
        System.out.print(" ");
        System.out.println(this.priezvisko);
        System.out.print("Dátum narodenia: ");
        System.out.println(this.datumNarodenia);
    }
}