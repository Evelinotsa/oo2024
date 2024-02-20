public class Raamat {
    String pealkiri;
    String autor;
    int aasta;
    double hind;

    public Raamat(String pealkiri, String autor, int aasta, double hind) {
        this.pealkiri = pealkiri;
        this.autor = autor;
        this.aasta = aasta;
        this.hind = hind;
    }

    public int raamatuVanus() {
        return 2024 - aasta;
    }

    public void soodusHind(double allahindlusProtsent) {
        hind = hind * (1 - allahindlusProtsent / 100);
    }
}
