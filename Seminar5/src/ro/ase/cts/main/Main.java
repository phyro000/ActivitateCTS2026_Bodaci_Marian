package ro.ase.cts.builder_1.main;

import ro.ase.cts.builder_1.clase.AbstractBuilder;
import ro.ase.cts.builder_1.clase.Internare;
import ro.ase.cts.builder_1.clase.InternareBuilder;

public class Main {
    public static void main(String[] args){
        Internare internare=new Internare();
        internare.setNumePacient("Georgel");
        internare.setPatRabatabil(true);

        Internare internare2=new Internare();
        internare.setNumePacient("Georgica");
        internare.setPatRabatabil(true);

        AbstractBuilder builder = new InternareBuilder("Georgica");

        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare
    }
}
