public class CirkusStringerto {
    private String retazec;
    
    public CirkusStringerto(String retazec) {
        this.retazec = retazec;
    }
    
    public String opakujRetazec(int pocet) {
        String docasnyRetazec = "";
        for (int i = 0; i < pocet; i++) {
            docasnyRetazec = this.retazec + docasnyRetazec;
        }
        
        return docasnyRetazec;
    }
}
