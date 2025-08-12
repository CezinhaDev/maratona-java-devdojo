package aula.dev.dojo.testMetodos;

import aula.dev.dojo.javacore.Metodos.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
         double resultado =  calculadora.divideDoisNumeros(20, 2);
         System.out.println(resultado);
    }
}
