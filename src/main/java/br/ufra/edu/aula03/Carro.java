package br.ufra.edu.aula03;

public class Carro {
    private int rpm;
    private int velocidade;
    private boolean ligado;

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        //Desligar apenas se o carro estiver parado
        if (velocidade == 0) {
            ligado = false;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar() {
        //Acelerar até um limite de velocidade,
        //quando o carro estiver ligado
        if (ligado && velocidade < 100) {
            rpm++;
            velocidade += 10;
        }
    }

    public void frear() {
        //Carro parado não precisa ser freado
        if (ligado && velocidade > 0) {
            rpm--;
            velocidade -= 10;
        }
    }
}
