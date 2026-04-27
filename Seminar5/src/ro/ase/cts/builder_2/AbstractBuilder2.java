package ro.ase.cts.builder_2;

import ro.ase.cts.builder_2.Internare;

public interface AbstractBuilder2 {
    Internare build();
    AbstractBuilder2 setNume(String nume);
    AbstractBuilder2 setPatRabatabil(boolean pat);
    AbstractBuilder2 setMicDejun(boolean mic);
    AbstractBuilder2 setPapuci(boolean papuci);
    AbstractBuilder2 setHalat(boolean halat);


}
