package br.ufra.edu.aula07;

public class PrincipalPessoa {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        fulano.setNome("Fulano");
        System.out.println(fulano.getNome() + "\n");

        Aluno ciclano = new Aluno();
        ciclano.setNome("Ciclano");
        ciclano.setMatricula("2025123");
        System.out.println(ciclano.getNome());
        System.out.println(ciclano.getMatricula() + "\n");

        Professor beltrano = new Professor();
        beltrano.setNome("Beltrano");
        beltrano.setSalario(1518);
        System.out.println(beltrano.getNome());
        System.out.println(beltrano.getSalario() + "\n");
    }
}
