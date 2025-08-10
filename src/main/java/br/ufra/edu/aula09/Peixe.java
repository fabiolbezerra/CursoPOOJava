package br.ufra.edu.aula09;

public class Peixe extends Animal {
    @Override
    public void movimentar(double distancia) {
        System.out.printf("Peixe nadando %.2f\n", distancia);
    }
}
