package ro.ase.cts.main;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipMancare;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15.5, 300.0);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 15.5, 300.0);

        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 15.15, 15.15, 15.15);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 15.15, 15.15, 15.15);

        supaCiuperci.afisare();
        supaLegume.afisare();
        clatite.afisare();
        papanasi.afisare();
    }
}
