package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipMancare;
import ro.ase.cts.enums.TipSupa;

public interface FabricaAbstracta {
    FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
    FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);
}
