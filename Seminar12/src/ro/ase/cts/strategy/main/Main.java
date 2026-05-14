package ro.ase.cts.strategy.main;

import ro.ase.cts.strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        ModSustinere scris = new ProbaScrisa();
        ModSustinere grila = new Grila();
        ModSustinere oral = new ProbaOrala();
        Student student = new Student(oral);

        student.examinare();
    }
}
