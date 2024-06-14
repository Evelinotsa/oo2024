//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Akvaarium akvaarium1 = new Akvaarium(12, 14, 9);
        Akvaarium akvaarium2 = new Akvaarium(10, 8, 20);

        akvaarium1.lisaVett(100);
        akvaarium2.lisaVett(50);
        System.out.println("Esimese akvaariumi ruumala: " + akvaarium1.getRuumala());
        System.out.println("Teise akvaariumi ruumala: " + akvaarium2.getRuumala());

        System.out.println("Veekogus esimeses akvaariumis:" + akvaarium1.getVeeKogus());
        System.out.println("Veekogus teises akvaariumis:" + akvaarium2.getVeeKogus());

        akvaarium1.transferVesi(akvaarium2, 50);

        System.out.println("Veekogus esimeses akvaariumis nüüd: " + akvaarium1.getVeeKogus());
        System.out.println("Veekogus teises akvaariumis nüüd: " + akvaarium2.getVeeKogus());
    }
}