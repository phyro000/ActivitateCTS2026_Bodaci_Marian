package ro.ase.cts.clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void proceseazaInternare(Pacient pacient) {
        if (this.medic.emiteTrimitere(pacient)) {
            int patDisponibil = this.salon.gasestePat();
            if (patDisponibil != -1) {
                System.out.println("Pacientul " + pacient.getNumePacient() + " a fost internat in patul " + patDisponibil + ".");
                salon.rezervaPat(patDisponibil);
            } else {
                System.out.println("Nu exista paturi libere pentru " + pacient.getNumePacient() + ". Se cauta alt salon.");
            }
        } else {
            System.out.println("Pacientul " + pacient.getNumePacient() + " nu are trimitere. Nivel urgenta: " + pacient.getNivelUrgenta() + ".");
        }
    }
}
