package br.ufra.edu.aula02;

public class Aluno {
    //Características do aluno

    String nome;
    String matricula;

    //Operações ou funções do aluno

    public void estudar() {
        System.out.printf("%s está estudando", nome);
    }

    public void fazerProva() {
        System.out.printf("%s está fazendo prova", nome);
    }
}
