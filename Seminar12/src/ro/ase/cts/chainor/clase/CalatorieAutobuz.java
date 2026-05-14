package ro.ase.cts.chainor.clase;

public class CalatorieAutobuz extends CalatorieHandler{
    public CalatorieAutobuz() {
        super(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 5){
            return "Autobuz";
        } else{
            return super.calatorieHandler.recomandaCalatorie(distanta);
        }
    }
}
