package br.ufra.edu.aula01;

import java.util.Scanner;

public class ProgramaImperativo {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual sua nota na primeira prova? ");
        double nota1 = entrada.nextDouble();
        System.out.print("Qual sua nota na segunda prova? ");
        double nota2 = entrada.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Vai pra recuperação.");
        }
    }
}
