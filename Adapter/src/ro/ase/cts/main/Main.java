package ro.ase.cts.main;

import ro.ase.cts.adapter.AdaptorMedicament;
import ro.ase.cts.clase.farmacie.MedicamentFarmacie;
import ro.ase.cts.clase.spital.MedicamentSpital;

public class Main {
    public static void proceseazaComanda(MedicamentFarmacie medicament) {
        medicament.cumpara();
    }

    public static void main(String[] args) {
        MedicamentSpital medSpital = new MedicamentSpital("Amoxicilina Forte", 32.5f);
        medSpital.verificaReteta();
        medSpital.elibereazaMedicament();

        MedicamentFarmacie medFarmacie = new MedicamentFarmacie("Aspirina");
        medFarmacie.cumpara();

        AdaptorMedicament adaptor = new AdaptorMedicament(medSpital);

        System.out.println("\n--- Procesare prin interfata farmaciei ---");
        proceseazaComanda(medFarmacie);
        proceseazaComanda(adaptor);
    }
}
