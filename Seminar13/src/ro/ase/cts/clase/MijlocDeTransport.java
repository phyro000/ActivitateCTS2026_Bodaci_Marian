package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    List<Calator> listaCalatori;
    String linie;

    public MijlocDeTransport(String linie) {
        this.linie = linie;
        listaCalatori = new ArrayList<>();
    }

    public void abonareCalator(Calator calator){
        listaCalatori.add(calator);
    }

    public void stergeCalator(Calator calator){
        listaCalatori.remove(calator);
    }

    public void notificareCalatori(String mesaj){
        for (Calator calator:listaCalatori){
            calator.notificare(mesaj+this.linie);
        }
    }

    public abstract void pleacaDinDepou();
    public abstract void ramandeBlocatInTrafic();
}
