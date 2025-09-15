package aula.dev.dojo.javacore.Gassociacao.Test;

import aula.dev.dojo.javacore.Gassociacao.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cesar");
        Jogador jogador2 = new Jogador("Maria");
        Jogador jogador3 = new Jogador("João");

        Jogador[] jogadores = { jogador1, jogador2, jogador3 };

        System.out.println("Jogadores do time: ");
        for (Jogador jogador : jogadores) { // foreach basicamente ele percorre o array inteiro e pega cada elemento do array e joga na variavel jogador e executa o bloco de codigo
            System.out.println(jogador.getNome());
        }

    }
}
