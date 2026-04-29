package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public class NotaDePlataPrintat1Mai extends NotaDePlataDecorator{
    public NotaDePlataPrintat1Mai(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 Mai!");
    }
}
