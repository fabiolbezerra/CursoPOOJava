package br.ufra.edu.aula09;

public class Gato extends Animal {
    @Override
    public void movimentar(double distancia) {
        System.out.printf("Gato andando %.2f\n", distancia);
    }
}
