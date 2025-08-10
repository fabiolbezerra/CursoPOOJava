package br.ufra.edu.aula11;

public abstract class Animal {
    private String nome;

    public abstract void movimentar(double distancia);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
