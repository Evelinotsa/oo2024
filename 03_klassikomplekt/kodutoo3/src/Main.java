import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stuudio stuudio1 = new Stuudio("Universal Pictures", "USA", 1912);
        Stuudio stuudio2 = new Stuudio("20th Century Studios", "USA", 1935);

        Naitleja naitleja1 = new Naitleja("Meryl Streep", "USA");
        Naitleja naitleja2 = new Naitleja("Pierce Brendan Brosnan", "UK");
        Naitleja naitleja3 = new Naitleja("Leonardo DiCaprio", "USA");
        Naitleja naitleja4 = new Naitleja("Kate Winslet", "UK");

        List<Naitleja> mammaMiaNaitlejad = new ArrayList<>();
        mammaMiaNaitlejad.add(naitleja1);
        mammaMiaNaitlejad.add(naitleja2);
        Film film1 = new Film("Mamma Mia!", 2008, stuudio1, mammaMiaNaitlejad);

        List<Naitleja> titanicNaitlejad = new ArrayList<>();
        titanicNaitlejad.add(naitleja3);
        titanicNaitlejad.add(naitleja4);
        Film film2 = new Film("Titanic", 1997, stuudio2, titanicNaitlejad);

        naitleja1.muudaRiik("Uk");
        System.out.println(naitleja1.riik);
        naitleja4.muudaNimi("Kate Elizabeth Winslet");
        System.out.println(naitleja4.nimi);

        stuudio1.muudaAsukohta("Itaalia");
        System.out.println(stuudio1.asukoht);
        System.out.println(stuudio2.arvutaVanus(2024));

        System.out.println(film1.filmiVanus(2024));
        film2.kuvaNaitlejad();
        film1.kuvaNaitlejad();
    }
}