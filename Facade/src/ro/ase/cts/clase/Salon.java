package ro.ase.cts.clase;

public class Salon {
    private boolean[] paturiDisponibile = new boolean[6];

    public Salon() {
        this.paturiDisponibile[1] = true;
        this.paturiDisponibile[3] = true;
        this.paturiDisponibile[5] = true;
    }

    public int gasestePat() {
        for (int i = 0; i < paturiDisponibile.length; i++) {
            if (paturiDisponibile[i])
                return i;
        }
        return -1;
    }

    public void rezervaPat(int index) {
        this.paturiDisponibile[index] = false;
    }
}
