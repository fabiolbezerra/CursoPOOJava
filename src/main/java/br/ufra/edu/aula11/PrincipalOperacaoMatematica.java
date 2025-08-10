package br.ufra.edu.aula11;

import java.util.ArrayList;

public class PrincipalOperacaoMatematica {
    public static void main(String[] args) {
        ArrayList<OperacaoMatematica> operacoes = new ArrayList<>();
        operacoes.add(new Adicao());
        operacoes.add(new Subtracao());

        //Criando dois números aleatórios entre 0 e 100
        double a = Math.random()*100;
        double b = Math.random()*100;
        double resultado = 0;

        //Executando operações com os números criados
        for (OperacaoMatematica om : operacoes) {
            resultado = om.calcular(a, b);
            System.out.printf("%f %s %f = %f\n", a, om.getOperador(), b, resultado);
        }
    }
}
