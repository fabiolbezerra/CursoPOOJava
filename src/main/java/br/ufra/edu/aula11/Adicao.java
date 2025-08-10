package br.ufra.edu.aula11;

public class Adicao extends OperacaoMatematica {

    public Adicao() {
        super('+');
    }

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
