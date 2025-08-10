package br.ufra.edu.aula04;

public class Aluno {
    private String matricula;
    //Atributos com static são da classe
    private static int totalDeAlunos;

    public Aluno(String matricula) {
        this.matricula = matricula;
        Aluno.totalDeAlunos++;
    }

    public String getMatricula() {
        return matricula;
    }

    //Métodos com static são da classe
    public static int getTotalDeAlunos() {
        return Aluno.totalDeAlunos;
    }
}
