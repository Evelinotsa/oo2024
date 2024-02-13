import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //klass, saab enda sisse terve hunniku funktsioone ja muutujaid
        Random random = new Random();

        Maailm maailm = new Maailm(5, 10);

        Mangija mangija = new Mangija(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Draakon draakon = new Draakon(random, maailm.kaardiKorgus, maailm.kaardiLaius);
        Ork ork = new Ork(random, maailm.kaardiKorgus, maailm.kaardiLaius);

        Scanner scanner = new Scanner(System.in);

        maailm.prindiKaart(mangija, draakon, ork);
        String sisend = scanner.nextLine();

        mangija.liigu(sisend, maailm);

        while (!sisend.equals("end")) { // .ecuals --> ==    !n.ecuals --> !=
            maailm.prindiKaart(mangija, draakon, ork);
            sisend = scanner.nextLine();
            mangija.liigu(sisend, maailm);
        }
    }// main (args[])
}// Main ()