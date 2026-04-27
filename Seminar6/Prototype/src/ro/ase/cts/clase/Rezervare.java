package ro.ase.cts.clase;

public class Rezervare implements RezervareAbstracta{
    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervarii;
    private String numeTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervarii, String numeTelefon) {
        if(numeClient.length()>1){
            this.numeClient = numeClient;
        } else{
            this.numeClient = "Ion";
        }

        if(oraRezervare<23 || oraRezervare>9){
            this.oraRezervare = oraRezervare;
        } else{
            this.oraRezervare = 9;
        }

        if(ziuaRezervarii<30){
            this.ziuaRezervarii = ziuaRezervarii;
        } else{
            this.ziuaRezervarii = 1;
        }

        if(numeTelefon.length()==10){
            this.numeTelefon = numeTelefon;
        } else{
            this.numeTelefon = "0799999999";
        }

    }

    private Rezervare() {

    }

    public void setOraRezervare(int oraRezervare) {

    }

    public void setZiuaRezervarii(int ziuaRezervarii) {
        if(ziuaRezervarii<30 && ziuaRezervarii>1){
            this.ziuaRezervarii = ziuaRezervarii;
        } else{
            this.ziuaRezervarii = 1;
        }
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient=this.numeClient;
        rezervareNoua.numeTelefon=this.numeTelefon;
        rezervareNoua.oraRezervare=this.oraRezervare;
        rezervareNoua.ziuaRezervarii=this.ziuaRezervarii;

        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervarii=").append(ziuaRezervarii);
        sb.append(", numeTelefon='").append(numeTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
