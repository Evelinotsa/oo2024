import java.util.Random;

public class Soiduk {
    String nimetus;
    int kiirus;
    int xCoord;
    int yCoord;
    int symbol;

    public Soiduk(String nimetus, int kiirus, Random random, Maailm maailm) {
        this.nimetus = nimetus;
        this.kiirus = kiirus;
        // this.xCoord = saaKoordinaat()
        this.symbol = 'S';
    }
}
