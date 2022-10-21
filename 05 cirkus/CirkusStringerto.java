public class CirkusStringerto {
    private String retazec;
    
    public CirkusStringerto(String retazec) {
        this.retazec = retazec;
    }
    
    public String opakujRetazec(int pocet) {
        StringBuilder docasnyRetazec = new StringBuilder();
        for (int i = 0; i < pocet; i++) {
            docasnyRetazec.append(this.retazec);
        }
        
        return docasnyRetazec.toString();
    }
    
    public boolean jePalindrom() {
        for (int i = 0; i < this.retazec.length(); i++) {
            char znakOdPredu = this.retazec.charAt(i);
            char znakOdZadu = this.retazec.charAt(this.retazec.length() - i - 1);
            if (znakOdPredu != znakOdZadu) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean jePalindromKratky() {
        return new StringBuilder(this.retazec).reverse().equals(this.retazec);
    }
}
