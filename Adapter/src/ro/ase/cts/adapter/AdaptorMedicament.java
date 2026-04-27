package ro.ase.cts.adapter;

import ro.ase.cts.clase.spital.MedicamentSpital;

public class AdaptorMedicament extends ro.ase.cts.clase.farmacie.MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getDenumire());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumpara() {
        this.medicamentSpital.elibereazaMedicament();
    }
}
