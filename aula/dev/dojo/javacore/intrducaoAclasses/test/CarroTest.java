package aula.dev.dojo.javacore.intrducaoAclasses.test;

import aula.dev.dojo.javacore.intrducaoAclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        // Primeiro carro
        Carro carro1 = new Carro();
        carro1.nome = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        // Segundo carro
        Carro carro2 = new Carro();
        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        carro1 = carro2; // referencias de objetos

        // Imprimindo os dados
        System.out.println("Carro 1:");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("----------------------------");

        System.out.println("Carro 2:");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
