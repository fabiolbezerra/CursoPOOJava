package br.ufra.edu.aula10;

import java.util.ArrayList;

public class PrincipalListaDePessoas {
    public static void main(String[] args) {
        //Criando uma lista vazia de pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        //Adicionando uma pessoa
        pessoas.add(new Pessoa());
        pessoas.get(0).setNome("Fulano");

        //Adicionando um aluno, pois "é uma" pessoa
        pessoas.add(new Aluno());
        pessoas.get(1).setNome("Ciclano");
        //Operação de casting, "atuando como um"
        ((Aluno) pessoas.get(1)).setMatricula("2025123");

        //Adicionado um professor, pois "é uma" pessoa
        pessoas.add(new Professor());
        pessoas.get(2).setNome("Beltrano");
        //Operação de casting, "atuando como um"
        ((Professor) pessoas.get(2)).setSalario(1518);
    }
}
