package br.ufra.edu.aula05;

public class PrincipalPonto {
    public static void main(String[] args) {
        Ponto a = new Ponto(1, 1.5);
        Ponto b = new Ponto(5, 4.5);
        //Duas formas de calcular a distância (métodos sobrecarregados)
        System.out.printf("Distância entre a e b: %.2f\n", a.distancia(b));
        double x = b.getX();
        double y = b.getY();
        System.out.printf("Distância entre a e b: %.2f\n", a.distancia(x, y));
    }
}
