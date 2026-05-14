package ro.ase.cts.chainor.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler calatorieHandler;

    public CalatorieHandler(CalatorieHandler calatorieHandler) {
        this.calatorieHandler = calatorieHandler;
    }

    public void setCalatorieHandler(CalatorieHandler calatorieHandler){
        this.calatorieHandler = calatorieHandler;
    }

    public abstract String recomandaCalatorie(double distanta);
}
