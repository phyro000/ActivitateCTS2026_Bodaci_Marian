package ro.ase.cts.main;

import ro.ase.cts.builder_1.clase.AbstractBuilder;
import ro.ase.cts.builder_1.clase.Internare;
import ro.ase.cts.builder_1.clase.InternareBuilder;
import ro.ase.cts.builder_2.AbstractBuilder2;
import ro.ase.cts.builder_2.InternareBuilder2;

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
        Internare internare4 = builder.setPapuci(true).build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        AbstractBuilder2 builder2=new InternareBuilder2();
        builder.setMicDejun(true);
        ro.ase.cts.builder_2.Internare internare5=builder2.build("Georgica");
    }
}
