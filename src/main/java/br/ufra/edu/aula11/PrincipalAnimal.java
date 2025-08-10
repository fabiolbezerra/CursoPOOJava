package br.ufra.edu.aula11;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Garfield");
        gato.movimentar(100);

        Peixe peixe = new Peixe();
        peixe.setNome("Nemo");
        peixe.movimentar(150);
    }
}
