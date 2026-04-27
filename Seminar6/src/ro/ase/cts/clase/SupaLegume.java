package ro.ase.cts.clase;

public class SupaLegume extends Supa{

    public SupaLegume(float pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
