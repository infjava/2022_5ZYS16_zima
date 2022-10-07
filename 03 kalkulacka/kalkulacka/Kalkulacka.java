public class Kalkulacka {
    private double operand;
    private double predchadzajucaHodnota;
    
    public Kalkulacka() {
        this.operand = 0;
        this.predchadzajucaHodnota = 0;
    }
    
    public void scitaj() {
        this.predchadzajucaHodnota = this.predchadzajucaHodnota + this.operand;
    }
    
    public void odcitaj() {
        this.predchadzajucaHodnota = this.predchadzajucaHodnota - this.operand;
    }
    
    public void vynasob() {
        this.predchadzajucaHodnota = this.predchadzajucaHodnota * this.operand;
    }
    
    public void vydel() {
        if (this.operand != 0) {
            this.predchadzajucaHodnota = this.predchadzajucaHodnota / this.operand;
        } else {
            System.out.println("Sorry, ale delit nulou nemozes");
        }
    }
    
    public double getVysledok() {
        return this.predchadzajucaHodnota;
    }
    
    public void setOperand(double operand) {
        this.operand = operand;
    }
    
    public void setPociatocneCislo(double pociatocneCislo) {
        this.predchadzajucaHodnota = pociatocneCislo;
    }
}