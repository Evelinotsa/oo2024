public class Tellimus {
    String tellija;
    double kogusumma;
    String tellitavEse;

    public Tellimus(String tellija, double kogusumma, String tellitavEse) {
        this.tellija = tellija;
        this.kogusumma = kogusumma;
        this.tellitavEse = tellitavEse;
    }

    public double tellimuseSummaDollarites() {
        return kogusumma * 1.07;
    }

    public void tellijaNimeVahetus(String tellijaUusNimi) {
        tellija = tellijaUusNimi;
    }
}
