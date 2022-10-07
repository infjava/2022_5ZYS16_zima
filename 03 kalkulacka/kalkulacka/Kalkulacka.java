public class Kalkulacka {
    private double operand;
    private double predchadzajucaHodnota;
    private char predchadzajucaOperacia;
    
    public Kalkulacka() {
        this.operand = 0;
        this.predchadzajucaHodnota = 0;
        this.predchadzajucaOperacia = '+';
    }
    
    public void vykonaj(char operacia) {
        switch (this.predchadzajucaOperacia) {
            case '+':
                this.predchadzajucaHodnota = this.predchadzajucaHodnota + this.operand;
                break;
            case '-':
                this.predchadzajucaHodnota = this.predchadzajucaHodnota - this.operand;
                break;
            case '*':
                this.predchadzajucaHodnota = this.predchadzajucaHodnota * this.operand;
                break;
            case '/':
                if (this.operand != 0) {
                    this.predchadzajucaHodnota = this.predchadzajucaHodnota / this.operand;
                } else {
                    System.out.println("Sorry, ale delit nulou nemozes");
                }
                break;
        }
        
        this.predchadzajucaOperacia = operacia;
    }
    
    public double getVysledok() {
        return this.predchadzajucaHodnota;
    }
    
    public void setOperand(double operand) {
        this.operand = operand;
    }
}