
/**
 * Write a description of class Hra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hra {
    private Hrac hrac;
    private Pocitac pocitac;
    
    public Hra() {
        Dlan dlanHraca = new Dlan(100);
        Dlan dlanPocitaca = new Dlan(200);
        
        this.hrac = new Hrac(dlanHraca);
        this.pocitac = new Pocitac(dlanPocitaca);
    }
    
    public void spusti() {
        Manazer manazer = new Manazer();
        manazer.spravujObjekt(this.hrac);
        manazer.spravujObjekt(this.pocitac);
        manazer.spravujObjekt(this);
    }
    
    public void zrus() {
        System.exit(0);
    }
}
