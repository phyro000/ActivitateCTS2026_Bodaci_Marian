package ro.ase.cts.builder_1.clase;

public class InternareBuilder implements AbstractBuilder{
    private Internare internare;

    public InternareBuilder(String numePacient){
        internare.setNumePacient(numePacient);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNume(String nume) {
        this.internare.setNumePacient(nume);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean pat) {
        this.internare.setPatRabatabil(pat);
        return this;
    }

    @Override
    public AbstractBuilder setMicDejun(boolean mic) {
        this.internare.setMicDejun(mic);
        return this;
    }

    @Override
    public AbstractBuilder setPapuci(boolean papuci) {
        this.internare.setPapuciCamera(papuci);
        return this;
    }

    @Override
    public AbstractBuilder setHalat(boolean halat) {
        this.internare.setHalat(halat);
        return this;
    }
}
