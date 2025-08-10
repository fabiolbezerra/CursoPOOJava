package br.ufra.edu.aula10;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        fulano.setNome("Fulano");

        //Um aluno "é uma" pessoa
        Pessoa ciclano = new Aluno();
        ciclano.setNome("Ciclano");
        //Operação de casting, "atuando como um"
        ((Aluno) ciclano).setMatricula("2025123");

        //Um professor "é uma" pessoa
        Pessoa beltrano = new Professor();
        beltrano.setNome("Beltrano");
        //Operação de casting, "atuando como um"
        ((Professor)beltrano).setSalario(1518);
    }
}
