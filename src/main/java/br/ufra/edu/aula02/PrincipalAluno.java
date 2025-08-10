package br.ufra.edu.aula02;

public class PrincipalAluno {
    public static void main(String[] args) {
        //a1 e a2 são representações concretas do modelo Aluno

        Aluno a1 = new Aluno();
        a1.nome = "Maria";
        a1.estudar();

        Aluno a2 = new Aluno();
        a2.nome = "José";
        a2.fazerProva();
    }
}
