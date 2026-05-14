package ro.ase.cts.command.clase;

public class Autobuz {
    private String producator;

    public Autobuz(String producator) {
        this.producator = producator;
    }

    private void plecarePeTraseu(int nrLinie){
        System.out.println("Autobuzul "+ nrLinie + " pleaca pe traseu");
    }
}
