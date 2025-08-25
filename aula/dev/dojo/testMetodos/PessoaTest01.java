package aula.dev.dojo.testMetodos;

import aula.dev.dojo.javacore.Metodos.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        // Acessando os atributos através dos métodos getters e setters
        // get é para obter o valor
        // set é para definir o valor
        p.setNome("João");
        p.setIdade(10);
       // p.imprimir();


       // usando o get
       System.out.println("Nome: " + p.getNome());
       System.out.println("Idade: " + p.getIdade());
    }
}
