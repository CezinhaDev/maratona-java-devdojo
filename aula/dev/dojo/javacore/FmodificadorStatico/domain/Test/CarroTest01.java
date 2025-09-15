package aula.dev.dojo.javacore.FmodificadorStatico.domain.Test;

import aula.dev.dojo.javacore.FmodificadorStatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", 280, 0);
        Carro carro1 = new Carro("Jetta", 280, 0);
        Carro carro2 = new Carro("Civic", 280, 0);
        carro.setVelocidadeMaxima(200);
        carro.imprime();
        carro1.imprime();
        carro2.imprime();
    }
}
