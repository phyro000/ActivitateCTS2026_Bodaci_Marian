package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ReceptieSpital;
import ro.ase.cts.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        Salon salon = new Salon();

        Pacient p1 = new Pacient("Marian", 7);

        System.out.println("--- Internare fara Facade ---");
        if (medic.emiteTrimitere(p1)) {
            int pat = salon.gasestePat();
            if (pat != -1) {
                System.out.println("Pacientul " + p1.getNumePacient() + " a fost internat in patul " + pat + ".");
                salon.rezervaPat(pat);
            }
        }

        System.out.println("\n--- Internare prin Facade (ReceptieSpital) ---");
        Pacient p2 = new Pacient("Ionut", 3);
        Pacient p3 = new Pacient("Elena", 9);
        Pacient p4 = new Pacient("Cristina", 6);
        Pacient p5 = new Pacient("Dragos", 8);

        ReceptieSpital receptie = new ReceptieSpital(medic, salon);
        receptie.proceseazaInternare(p2);
        receptie.proceseazaInternare(p3);
        receptie.proceseazaInternare(p4);
        receptie.proceseazaInternare(p5);
    }
}
