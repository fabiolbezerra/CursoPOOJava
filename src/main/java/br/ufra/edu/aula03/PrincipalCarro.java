package br.ufra.edu.aula03;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        System.out.printf("Velocidade: %d\n", fusca.getVelocidade());
        fusca.ligar();
        System.out.printf("Velocidade: %d\n", fusca.getVelocidade());
        fusca.acelerar();
        System.out.printf("Velocidade: %d\n", fusca.getVelocidade());
        fusca.frear();
        System.out.printf("Velocidade: %d\n", fusca.getVelocidade());
        fusca.desligar();
        System.out.printf("Velocidade: %d\n", fusca.getVelocidade());
    }
}
