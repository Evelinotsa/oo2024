import java.util.Random;

public class Ork {
    int xCoord; // deklareerin (loob + mälukoht)
    int yCoord; // parem klõps tema peal --> refactor --> rename
    char symbol;

    public Ork(Random random, int kaardiKorgus, int kaardiLaius) {
        xCoord = saaKoordinaat(random, kaardiKorgus); // initsialiseerin (annan esimest korda väärtuse)
        yCoord = saaKoordinaat(random, kaardiLaius);
        symbol = 'O';
    }
    private int saaKoordinaat(Random random, int kaart) {

        return random.nextInt(1, kaart - 1);
    }

}
