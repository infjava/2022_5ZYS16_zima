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
}
