package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CalatorAbonat;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        Calator calator = new CalatorAbonat("Gabi");
        Calator calator1 = new CalatorAbonat("Gabi1");
        Calator calator2 = new CalatorAbonat("Gabi2");

        MijlocDeTransport autobuz = new Autobuz("20");
        autobuz.abonareCalator(calator);
        autobuz.abonareCalator(calator1);
        autobuz.abonareCalator(calator2);

        autobuz.notificareCalatori("Autobuzul a plecat de pe linie");

        autobuz.pleacaDinDepou();
        autobuz.ramandeBlocatInTrafic();
    }
}
