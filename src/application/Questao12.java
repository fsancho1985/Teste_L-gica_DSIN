package application;

import entities.Pato;

public class Questao12 {
    public static void main(String[] args) {

        Pato pato1 = new Pato("Patolino", 25, "Preto");
        Pato pato2 = new Pato("Donald", 20, "Branco");

        System.out.println(pato1);
        pato1.quack();
        pato1.nadar();
        pato1.voar();

        System.out.println(pato2);
        pato2.quack();
        pato2.nadar();
        pato2.voar();
    }
}
