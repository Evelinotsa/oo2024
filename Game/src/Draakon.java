import java.util.Random;

public class Draakon extends Tegelane{

    // constructor
    public Draakon(Random random, int kaardiKorgus, int kaardiLaius) {
        xCoord = saaKoordinaat(random, kaardiKorgus); // initsialiseerin (annan esimest korda väärtuse)
        yCoord = saaKoordinaat(random, kaardiLaius);
        symbol = 'D';
    }
    private int saaKoordinaat(Random random, int kaart) {

        return random.nextInt(1, kaart - 1);
    }

}
