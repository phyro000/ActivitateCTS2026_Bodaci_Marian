package ro.ase.cts.builder_1.clase;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNume(String nume);
    AbstractBuilder setPatRabatabil(boolean pat);
    AbstractBuilder setMicDejun(boolean mic);
    AbstractBuilder setPapuci(boolean papuci);
    AbstractBuilder setHalat(boolean halat);


}
