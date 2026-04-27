package ro.ase.cts.clase.farmacie;

public class MedicamentFarmacie {
    private String denumire;

    public MedicamentFarmacie(String denumire) {
        this.denumire = denumire;
    }

    public void cumpara() {
        System.out.println("Farmacia a vandut medicamentul " + this.denumire + ".");
    }
}
