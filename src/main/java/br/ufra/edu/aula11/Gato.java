package br.ufra.edu.aula11;

public class Gato extends Animal implements Mamifero {
    @Override
    public void movimentar(double distancia) {
        System.out.printf("%s andando %.2f\n", getNome(), distancia);
    }

    @Override
    public void amamentar() {
        System.out.println("Amamentando");
    }
}
