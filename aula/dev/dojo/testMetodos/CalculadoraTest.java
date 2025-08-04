package aula.dev.dojo.testMetodos;

import aula.dev.dojo.javacore.Metodos.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();// instancia

        calculadora.somaDoisNumeros();
        System.out.println("Fim");

        calculadora.subSoma();
        System.out.println("outro tipo de metodo");

    }
}
