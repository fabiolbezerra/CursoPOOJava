package br.ufra.edu.aula11;

public abstract class OperacaoMatematica {
    private char operador;

    public OperacaoMatematica(char operador) {
        this.operador = operador;
    }

    public char getOperador() {
        return operador;
    }

    public abstract double calcular(double a, double b);
}
