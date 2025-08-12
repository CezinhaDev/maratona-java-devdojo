package aula.dev.dojo.testMetodos;

import aula.dev.dojo.javacore.Metodos.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        // Testando os métodos da Calculadora
        // Criação de uma instância da Calculadora
        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 20;
        calculadora.multiplicaNumeros(num1, num2);
        System.out.println("Divisão: " + calculadora.divideDoisNumeros(num1, num2));
        calculadora.alteraDoisNumeros(num1, num2);
    }
}
