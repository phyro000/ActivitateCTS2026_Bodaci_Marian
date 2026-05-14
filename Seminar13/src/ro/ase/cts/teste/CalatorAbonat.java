package ro.ase.cts.teste;

import ro.ase.cts.clase.Calator;

public class CalatorAbonat implements Calator {
    String nume;
    private float sold;

    public CalatorAbonat(String gabi) {
        nume = gabi;
    }

    public float getSold() {
        return sold;
    }

    @Override
    public void notificare(String numar) {
        System.out.println(nume+", autobuzul "+numar+" a plecat.");
    }
}
