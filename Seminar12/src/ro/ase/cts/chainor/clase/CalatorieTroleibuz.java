package ro.ase.cts.chainor.clase;

public class CalatorieTroleibuz extends CalatorieHandler{

    public CalatorieTroleibuz() {
        super(calatorieHandler);
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 3){
            return "Troleibuz";
        } else{
            return super.calatorieHandler.recomandaCalatorie(distanta);
        }
    }


}
