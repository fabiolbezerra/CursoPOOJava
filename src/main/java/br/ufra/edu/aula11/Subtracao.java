package br.ufra.edu.aula11;

public class Subtracao extends OperacaoMatematica {

    public Subtracao() {
        super('-');
    }

    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
