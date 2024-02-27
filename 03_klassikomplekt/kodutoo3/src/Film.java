import java.util.List;

public class Film {
    String nimi;
    int aasta;
    Stuudio stuudio;
    List<Naitleja> naitlejad;

    public Film(String nimi, int aasta, Stuudio stuudio, List<Naitleja> naitlejad) {
        this.nimi = nimi;
        this.aasta = aasta;
        this.stuudio = stuudio;
        this.naitlejad = naitlejad;
    }

    public int filmiVanus(int praeguneAasta) {
        return praeguneAasta - aasta;
    }

    public void kuvaNaitlejad() {
        System.out.println("Näitlejad filmis " + nimi + ":");
        for (Naitleja naitleja : naitlejad) {
            System.out.println("- " + naitleja.nimi);
        }
    }
}

