public class Stuudio {
    String nimi;
    String asukoht;
    int asutamisAasta;

    public Stuudio(String nimi, String asukoht, int asutamisAasta) {
        this.nimi = nimi;
        this.asukoht = asukoht;
        this.asutamisAasta = asutamisAasta;
    }

    public void muudaAsukohta(String asukoht) {
        this.asukoht = asukoht;
    }

    public int arvutaVanus(int praeguneAasta) {
        return praeguneAasta - asutamisAasta;
    }
}

