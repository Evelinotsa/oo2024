public class Naitleja {
    String nimi;
    String riik;

    public Naitleja(String nimi, String riik) {
        this.nimi = nimi;
        this.riik = riik;
    }

    public void muudaNimi(String nimi) {
        this.nimi = nimi;
    }

    public void muudaRiik(String riik) {
        this.riik = riik;
    }
}