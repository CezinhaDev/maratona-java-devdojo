package aula.dev.dojo.testMetodos;

import aula.dev.dojo.javacore.Metodos.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // Criando dois funcionários
        Funcionario funcionario1 = new Funcionario("Cesar", 2000.0, 21);
        Funcionario funcionario2 = new Funcionario("Maria", 1000.0, 25);

        // Imprimir dados
        funcionario1.imprimir();
        funcionario2.imprimir();

        // Calcular média salarial
        double media = (funcionario1.getSalario() + funcionario2.getSalario()) / 2;
        System.out.println("Média salarial: " + media);
    }
}
