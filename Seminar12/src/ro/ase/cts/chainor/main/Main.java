package ro.ase.cts.chainor.main;

import ro.ase.cts.chainor.clase.CalatorieAutobuz;
import ro.ase.cts.chainor.clase.CalatorieHandler;
import ro.ase.cts.chainor.clase.CalatorieTramvai;
import ro.ase.cts.chainor.clase.CalatorieTroleibuz;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieMetrou = new CalatorieTramvai();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();

        calatorieTroleibuz.setCalatorieHandler(calatorieAutobuz);
        calatorieAutobuz.setCalatorieHandler(calatorieAutobuz);
        calatorieTramvai.setCalatorieHandler(calatorieTramvai);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(5));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(12));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(4));
    }
}
