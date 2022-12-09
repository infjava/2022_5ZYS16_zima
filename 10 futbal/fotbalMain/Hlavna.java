import java.util.Scanner;

public class Hlavna {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        ZoznamTimov zoznam = new ZoznamTimov();
        String prikaz;
        do {
            System.out.println("Mozne prikazy:");
            System.out.println("pridaj");
            System.out.println("registruj");
            System.out.println("vytvor");
            System.out.println("vypis");
            System.out.println("vyhodnot");
            System.out.println("zapas");
            System.out.println("uzavri");
            System.out.println("ukonci");
            
            System.out.print("> ");
            prikaz = vstup.nextLine();
            
            switch (prikaz) {
                case "pridaj":
                    System.out.print("Zadaj nazov noveho timu> ");
                    String nazovTimu = vstup.nextLine();
                    
                    System.out.println("Vyber krajinu povodu:");
                    Krajina[] krajiny = Krajina.values();
                    for (int i = 0; i < krajiny.length; i++) {
                        System.out.format("%d. %s%n", i, krajiny[i]);
                    }
                    System.out.print("> ");
                    int cisloKrajiny = Integer.parseInt(vstup.nextLine());
                    Krajina krajinaTimu = krajiny[cisloKrajiny];
                    System.out.format("Tim %s z krajiny %s pridany do zoznamu%n", nazovTimu, krajinaTimu);
                    
                    zoznam.pridajTim(new Tim(nazovTimu, krajinaTimu));
                    
                    break;
            }
        } while (!prikaz.equals("ukonci"));
    }
}
