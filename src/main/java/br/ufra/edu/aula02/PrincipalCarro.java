package br.ufra.edu.aula02;

public class PrincipalCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fusca", "Preto", 2025, "JTA0H00");
        System.out.printf("%s (%s)\n", c1.modelo, c1.placa);
        Carro c2 = new Carro("Brasília", "Amarelo", 2025, "JTB0I00");
        System.out.printf("%s (%s)\n", c2.modelo, c2.placa);
    }
}
