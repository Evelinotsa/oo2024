//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // KODUS: 3 funktsiooni, milles on kasutatud vähemalt nelja erinevat tüüpi:
        // void, String, int, char, double, float, boolean
        // tagastab int     parameetriks boolean
        // tagastab void    parameetriks boolean, int
        // tagastab String  parameetriks String

        // Teha igast funktsioonist 2 erineva sisendiga väljakutset

        double kogumaksumus1 = arvutaTaksoMaksumus(3);
        System.out.println(kogumaksumus1);
        double kogumaksumus2 = arvutaTaksoMaksumus(2);
        System.out.println(kogumaksumus2);
        String hinnang1 = temperatuuriHinnang(-1.2);
        System.out.println(hinnang1);
        String hinnang2 = temperatuuriHinnang(2.3);
        System.out.println(hinnang2);
        prindiForTsykkel("Pikk sõna");
        prindiForTsykkel("Lyh");

        //Kodutöö:
        boolean vastus1 = paarisPaaritu(4);
        System.out.println(vastus1);
        boolean vastus2 = paarisPaaritu(7);
        System.out.println(vastus2);

        String pikem1 = leiaPikem("kass", "hobune");
        System.out.println(pikem1);
        String pikem2 = leiaPikem("kala", "uss");
        System.out.println(pikem2);

        arvudVahemikus(2, 9);
        arvudVahemikus(7, 10);
    }

    private static double arvutaTaksoMaksumus(int tunnid) {
        return 3 + 0.9*tunnid;
    }

    private static String temperatuuriHinnang(double temp) {
        if (temp < 0) {
            return "Vesi oli jääs";
        } else {
            return "On vesi";
        }
    }

    private static void prindiForTsykkel(String tahtedeArv) {
        for (int i = 0; i < tahtedeArv.length(); i++) {
            System.out.println(i);
        }
    }

    private static boolean paarisPaaritu(int arv) {
        return arv % 2 == 0;
    }

    private static String leiaPikem(String sona1, String sona2) {
        if (sona1.length() > sona2.length()) {
            return sona1;
        } else {
            return sona2;
        }
    }

    private static void arvudVahemikus(int algus, int lopp) {
        for (int j = algus + 1; j <= lopp - 1; j++) {
            System.out.println(j);
        }
    }
}