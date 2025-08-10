package br.ufra.edu.aula08;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Espécie do animal: " + animal.especie + "\n");

        //Ao criar o gato, "o animal" é criado antes
        Gato gato = new Gato();
        System.out.println("Espécie do gato: " + gato.especie);
        System.out.println("Pêlo do gato: " + gato.especie + "\n");

        //Ao criar o peixe, "o animal" é criado antes
        Peixe peixe = new Peixe();
        System.out.println("Espécie do peixe: " + peixe.especie);
        System.out.println("Escama do peixe: " + peixe.escama);
    }
}
