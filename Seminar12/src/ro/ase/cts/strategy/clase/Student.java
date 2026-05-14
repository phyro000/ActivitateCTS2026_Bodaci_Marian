package ro.ase.cts.strategy.clase;

public class Student {
    private ModSustinere mod;

    public Student(ModSustinere mod) {
        this.mod = mod;
    }

    public Student() {
        this.mod = new Grila();
    }

    public void examinare(){
        mod.sustinereExamen();
    }
}
