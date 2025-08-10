package br.ufra.edu.aula01;

public class ProgramaOrientadoAObjetos {
    public static void main(String[] args) {
        //Criando o objeto
        Jogador j10 = new Jogador();
        //Definindo o estado do objeto
        j10.nome = "Pelé";
        j10.altura = 1.73;
        j10.peso = 73;
        j10.posicao = "Meia atacante";
        //Apresentando o estado do objeto
        System.out.println(j10.nome);
        System.out.println(j10.posicao);
        //Explorando o comportamento do objeto
        j10.driblar();
    }
}
