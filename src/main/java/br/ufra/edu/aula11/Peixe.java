package br.ufra.edu.aula11;

public class Peixe extends Animal {
    @Override
    public void movimentar(double distancia) {
        System.out.printf("s% nadando %.2f\n", getNome(), distancia);
    }
}
