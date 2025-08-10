package br.ufra.edu.aula08;

public class Animal {
    String especie;

    //Construtor padrão (sem parâmetros)
    public Animal() {
        System.out.println("Criando o animal ...");
    }

    //Construtor NÃO padrão (com parâmetros)
    public Animal(String especie) {
        this.especie = especie;
    }
}
