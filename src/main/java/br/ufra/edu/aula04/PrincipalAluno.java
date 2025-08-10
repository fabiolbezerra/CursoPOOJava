package br.ufra.edu.aula04;

public class PrincipalAluno {
    public static void main(String[] args) {
        //A quantidade de objetos alunos independe da existência de um objeto Aluno
        System.out.printf("Total de alunos (c): %d\n", Aluno.getTotalDeAlunos());

        //Criando um objeto Aluno
        Aluno fulano = new Aluno("20250001");
        //Apresentando a quantidade de objetos a partir da classe (c) e da instância (i)
        System.out.printf("Total de alunos (c): %d\n", Aluno.getTotalDeAlunos());
        System.out.printf("Total de alunos (i): %d\n", fulano.getTotalDeAlunos());

        //Criando outro objeto Aluno
        Aluno ciclano = new Aluno("20250002");
        //Apresentando a quantidade de objetos a partir da classe (c) e da instância (i)
        System.out.printf("Total de alunos (c): %d\n", Aluno.getTotalDeAlunos());
        System.out.printf("Total de alunos (i): %d\n", ciclano.getTotalDeAlunos());
    }
}
