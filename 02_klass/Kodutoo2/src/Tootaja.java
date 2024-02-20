public class Tootaja {
    String nimi;
    int vanus;
    boolean puhkusel;
    double palk;

    public Tootaja(String nimi, int vanus, boolean puhkusel, double palk) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.puhkusel = puhkusel;
        this.palk = palk;
    }

    public void muudaPuhkusel() {
        puhkusel = !puhkusel;
    }

    public double palgaLisa(double summa) {
        palk = palk + summa;
        return palk;
    }

}
