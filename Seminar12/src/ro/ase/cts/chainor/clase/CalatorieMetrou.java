package ro.ase.cts.chainor.clase;

public class CalatorieMetrou extends CalatorieHandler{
    public CalatorieMetrou(CalatorieHandler calatorieHandler) {
        super(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        return "Metrou";
    }
}
