package br.ufra.edu.aula05;

public class Ponto {
    //Atributos que definem as coordenadas do ponto
    private double x;
    private double y;

    //Para criar um ponto, sempre necessário informar as coordenadas
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Calculando a distância a partir das coordenadas
    public double distancia(double x, double y) {
        double quadradoDiferencaX = Math.pow(this.x - x, 2);
        double quadradoDiferencaY = Math.pow(this.y - y, 2);
        double distancia = Math.sqrt(quadradoDiferencaX + quadradoDiferencaY);
        return distancia;
    }

    //Calculando a distância a partir de um ponto
    public double distancia(Ponto ponto) {
        return distancia(ponto.getX(), ponto.getY());
    }
}
