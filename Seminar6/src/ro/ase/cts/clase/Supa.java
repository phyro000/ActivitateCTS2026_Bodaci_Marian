package ro.ase.cts.clase;

public abstract class Supa {
    protected float pret;
    protected float gramaj;

    public Supa(float pret, float gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "pret=" + pret +
                ", gramaj=" + gramaj +
                '}';
    }
}
