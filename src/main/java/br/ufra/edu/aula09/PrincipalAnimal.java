package br.ufra.edu.aula09;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.movimentar(50);

        Gato gato = new Gato();
        gato.movimentar(100);

        Peixe peixe = new Peixe();
        peixe.movimentar(150);
    }
}
