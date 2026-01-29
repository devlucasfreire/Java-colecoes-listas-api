package Exercicios;

import modelosExercicios.Animal;
import modelosExercicios.Cachorro;

import java.util.ArrayList;

public class PrincipalAnimal {
    public static void main(String[] args) {


        var papagaio = new Animal("Papagaio", 15);
        Animal cachorro = new Cachorro("Aldofo", 9);

        ArrayList<Animal> lista = new ArrayList<>();

        lista.add(papagaio);
        lista.add(cachorro);

        System.out.println("------ Lista de animais ------");
        for (Animal a: lista) {
            System.out.println(a);
            if (a instanceof Cachorro) {
                System.out.println(((Cachorro) a).erguerPatas());
            }
        }

    }

}
