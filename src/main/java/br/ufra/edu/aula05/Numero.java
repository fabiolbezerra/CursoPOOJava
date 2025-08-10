package br.ufra.edu.aula05;

public class Numero {
    private double valor;

    //Método para somar um double
    public void somar(double valor) {
        this.valor += valor;
    }

    //Método sobrecarregado para somar um inteiro
    public void somar(int valor) {
        this.valor += valor;
    }

    public double getValor() {
        return valor;
    }
}
