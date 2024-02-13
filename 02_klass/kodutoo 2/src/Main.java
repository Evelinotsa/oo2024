//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Main class + enda tehtud class
        //Classis constructor
        //vähemalt 2 omadust
        //vähemalt 2 funktsiooni

        //Mainis vähemalt 2 instantsi temast
        //Mainis vähemalt 2 funktsiooni väljakutset
        // Mainis vähemalt 2 System.out.println()

        Kasutaja kasutaja = new Kasutaja("M", true, 20, 'x', 0.0);
        Kasutaja kasutaja2 = new Kasutaja("S", false, 35, 'q', 40.0);

        kasutaja.muudaAktiivne();
        System.out.println(kasutaja.aktiivne);
        kasutaja2.lisaRaha(500.0);
        System.out.println(kasutaja2.raha);

        Tellimus tellimus1 = new Tellimus("M", 199.0, "h");
        Tellimus tellimus2 = new Tellimus("N", 299.0, "w");

        tellimus2.tellijaNimeVahetus("E");
        System.out.println(tellimus2.tellija);

        double dollarites = tellimus1.tellimuseSummaDollarites();
        System.out.println(dollarites);
    }
}