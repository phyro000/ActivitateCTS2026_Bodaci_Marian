package ro.ase.cts.clase;

public abstract class Desert implements FelMancare{
    protected float pret;
    protected float gramaj;
    protected int calorii;

    public Desert(float pret, float gramaj, int calorii) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "pret=" + pret +
                ", gramaj=" + gramaj +
                ", calorii=" + calorii +
                '}';
    }
}
