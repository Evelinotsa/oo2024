public class Akvaarium {
    int pikkus;
    int laius;
    int k6rgus;
    double veeKogus;

    public Akvaarium(int pikkus, int laius, int k6rgus) {
        this.pikkus = pikkus;
        this.laius = laius;
        this.k6rgus = k6rgus;
        this.veeKogus = 0;
    }

    public double getRuumala() {
        return pikkus * laius * k6rgus;
    }

    public void lisaVett(double kogus) {
        if (kogus < 0) {
            System.out.println("Negatiivset kogust vett lisada ei saa");
            return;
        }
        double maxKogus = getRuumala();
        if (veeKogus + kogus > maxKogus) {
            veeKogus = maxKogus;
            System.out.println("Liiga palju vett");
        } else {
            veeKogus += kogus;
        }
    }

    public double getVeeKogus() {
        return veeKogus;
    }

    public void transferVesi(Akvaarium teineAkvaarium, double kogus) {
        if (kogus < 0) {
            System.out.println("Negatiivset veekogust ei saa valada");
            return;
        }

        double maxKogusTeineAkvaarium = teineAkvaarium.getRuumala();
        double newVeeKogusTeineAkvaarium = teineAkvaarium.getVeeKogus() + kogus;

        if (newVeeKogusTeineAkvaarium > maxKogusTeineAkvaarium) {
            System.out.println("Valatavat vett on liiga palju");
        } else {
            teineAkvaarium.veeKogus = newVeeKogusTeineAkvaarium;
            this.veeKogus -= kogus;

            double freeSpaceTeineAkvaarium = teineAkvaarium.k6rgus - (teineAkvaarium.veeKogus / (teineAkvaarium.pikkus * teineAkvaarium.laius));
            if (freeSpaceTeineAkvaarium < 2) {
                System.out.println("Akvaariumi servani jääb vähem kui 2 cm vaba ruumi!");
            }
        }
    }
}

