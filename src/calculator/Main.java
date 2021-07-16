package calculator;

public class Main {
    public static void main (String args[]) {

        System.out.println("Standard-Rechner:");
        Standard stnd1 = new Standard(2, 4);
        System.out.println(stnd1.getNum1() + " + " + stnd1.getNum2() + " = " + stnd1.opAdd());
        System.out.println(stnd1.getNum1() + " - " + stnd1.getNum2() + " = " + stnd1.opSub());

        System.out.println("Finanz-Rechner:");
        Finanz finz1 = new Finanz(2, 8, 200, 3, 52);
        System.out.println(finz1.getNum1() + " + " + finz1.getNum2() + " = " + finz1.opAdd());
        System.out.println("Die Zinsen bei " + finz1.getZins() + "% für " + finz1.getKapital() + "€ betragen: " + finz1.opZins() + "€");

        System.out.println("Wissenschaftlicher-Rechner:");
        Wissen wissen1 = new Wissen(64, 20);
        System.out.println("Die Wurzel aus " + wissen1.getNum1() + " ist: " + wissen1.opwWurzel());

    }
}
