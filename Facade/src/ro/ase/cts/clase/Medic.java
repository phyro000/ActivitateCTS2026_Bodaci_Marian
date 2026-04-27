package ro.ase.cts.clase;

public class Medic {
    public boolean emiteTrimitere(Pacient pacient) {
        return pacient.getNivelUrgenta() > 4;
    }
}
