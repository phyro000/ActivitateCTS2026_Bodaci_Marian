package ro.ase.cts.builder_2;

import ro.ase.cts.builder_2.AbstractBuilder2;
import ro.ase.cts.builder_2.Internare;

public class InternareBuilder2 implements AbstractBuilder2{
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;



    @Override
    public Internare build(String nume) {
        return new Internare(patRabatabil, micDejun, papuciCamera, halat);
    }

    @Override
    public AbstractBuilder2 setNume(String nume) {
        this.numePacient = nume;
        return this;
    }

    @Override
    public AbstractBuilder2 setPatRabatabil(boolean pat) {
        this.patRabatabil=pat;
        return this;
    }

    @Override
    public AbstractBuilder2 setMicDejun(boolean mic) {
        this.micDejun=mic;
        return this;
    }

    @Override
    public AbstractBuilder2 setPapuci(boolean papuci) {
        this.papuciCamera=papuci;
        return this;
    }

    @Override
    public AbstractBuilder2 setHalat(boolean halat) {
        this.halat=halat;
        return this;
    }
}
