package ro.ase.cts.teste;

import ro.ase.cts.clase.MijlocDeTransport;

public class Autobuz extends MijlocDeTransport {
    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj = "Autobuzul de pe linia "+ super.linie+" pleaca din depou";
        notificareCalatori(mesaj);
    }

    @Override
    public void ramandeBlocatInTrafic() {
        String mesaj = "Autobuzul de pe luinia "+ super.linie+" e blocat in trafic";
        notificareCalatori(mesaj);
    }
}
