package br.ufra.edu.aula05;

public class PrincipalNumero {
    public static void main(String[] args) {
        Numero numero = new Numero();
        //Diferentes formas, sobrecarregadas, de somar um valor
        System.out.printf("\nNúmero: %.2f", numero.getValor());
        numero.somar(10);
        System.out.printf("\nNúmero: %.2f", numero.getValor());
        numero.somar(10.5);
        System.out.printf("\nNúmero: %.2f", numero.getValor());
    }
}
