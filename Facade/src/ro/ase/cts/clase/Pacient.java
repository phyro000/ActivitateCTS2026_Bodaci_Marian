package ro.ase.cts.clase;

public class Pacient {
    private String numePacient;
    private int nivelUrgenta;

    public Pacient(String numePacient, int nivelUrgenta) {
        this.numePacient = numePacient;
        this.nivelUrgenta = nivelUrgenta;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public int getNivelUrgenta() {
        return nivelUrgenta;
    }
}
