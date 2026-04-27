package ro.ase.cts.clase.spital;

public class MedicamentSpital {
    private String denumire;
    private float pretUnitar;

    public MedicamentSpital(String denumire, float pretUnitar) {
        this.denumire = denumire;
        this.pretUnitar = pretUnitar;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPretUnitar() {
        return pretUnitar;
    }

    public boolean verificaReteta() {
        return this.denumire.length() > 8;
    }

    public void elibereazaMedicament() {
        if (verificaReteta()) {
            System.out.println("Spitalul a eliberat medicamentul " + this.denumire + " cu pretul de " + this.pretUnitar + " lei.");
        } else {
            System.out.println("Reteta nu a fost prezentata pentru " + this.denumire + ".");
        }
    }
}
