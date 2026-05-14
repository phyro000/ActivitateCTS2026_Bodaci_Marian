package ro.ase.cts.chainor.clase;

public class CalatorieTramvai extends CalatorieHandler{
    public CalatorieTramvai() {
        super(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 10){
            return "Tramvai";
        } else{
            return super.calatorieHandler.recomandaCalatorie(distanta);
        }
    }
}
