import java.util.Random;

public class Ork extends Tegelane implements JuhuslikKoordinaat{

    public Ork(Random random, int kaardiKorgus, int kaardiLaius) {
        xCoord = saaKoordinaat(random, kaardiKorgus); // initsialiseerin (annan esimest korda väärtuse)
        yCoord = saaKoordinaat(random, kaardiLaius);
        symbol = 'O';
    }
     public int saaKoordinaat(Random random, int kaart) {

        return random.nextInt(1, kaart - 1);
    }

}
