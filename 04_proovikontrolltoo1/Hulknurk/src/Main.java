import java.util.ArrayList;
import java.util.List;

//Hulknurk
//
//1. Koosta klass, milles on üks massiiv kolmnurga x-koordinaatide hoidmiseks ning teine massiiv y-koordinaatide hoidmiseks. Koosta klassist kaks eksemplari, määra algväärtused ning trüki andmed välja.
//
//2. Lisa klassile käsklus punkti koordinaadipaari lisamiseks. Käsklusena väljasta tekkiva hulknurga ümbermõõt (küljepikkuste summa).
//
//3. Kuva tekkiv hulknurk graafiliselt, kirjuta külgede juurde nende pikkused ning hulknurga keskele kogu ümbermõõt.
public class Main {
    public static void main(String[] args) {

        List<Integer> kolmnurk1xCoords = new ArrayList<>();
        kolmnurk1xCoords.add(6);
        kolmnurk1xCoords.add(8);
        kolmnurk1xCoords.add(10);

        List<Integer> kolmnurk1yCoords = new ArrayList<>();
        kolmnurk1yCoords.add(2);
        kolmnurk1yCoords.add(5);
        kolmnurk1yCoords.add(1);

        Kolmnurk kolmnurk1 = new Kolmnurk(kolmnurk1xCoords, kolmnurk1yCoords);

        System.out.println(kolmnurk1.xCoords);
        System.out.println(kolmnurk1.yCoords);

        int ymberm66t = kolmnurk1.lisaKoordinaadid(5, 10);
        System.out.println(ymberm66t);
    }
}