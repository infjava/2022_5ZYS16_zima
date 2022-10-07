public class Kalkulacka {
    private double predchadzajucaHodnota;
    
    public Kalkulacka() {
        this.predchadzajucaHodnota = 0;
    }
    
    public void scitaj(double operand) {
        this.predchadzajucaHodnota = this.predchadzajucaHodnota + operand;
    }
    
    public void odcitaj(double operand) {
        this.predchadzajucaHodnota = this.predchadzajucaHodnota - operand;
    }
    
    public void vynasob(double operand) {
        this.predchadzajucaHodnota = this.predchadzajucaHodnota * operand;
    }
    
    public void vydel(double operand) {
        this.predchadzajucaHodnota = this.predchadzajucaHodnota / operand;
    }
    
    public double getVysledok() {
        return this.predchadzajucaHodnota;
    }
    
    public void setPociatocneCislo(double pociatocneCislo) {
        this.predchadzajucaHodnota = pociatocneCislo;
    }
}