package br.ufra.edu.aula02;

public class PrincipalCelular {
    public static void main(String[] args) {
        //Criando um celular
        Celular samsung = new Celular();
        //Apresentando o estado de um celular recém-criado
        System.out.printf("Ligado? %s\n", samsung.ligado);
        //Ligando o celular e apresentando o novo estado do mesmo
        samsung.ligar();
        System.out.printf("Ligado? %s\n", samsung.ligado);
        //Desligando o celular e apresentando o novo estado do mesmo
        samsung.desligar();
        System.out.printf("Ligado? %s\n", samsung.ligado);
    }
}
