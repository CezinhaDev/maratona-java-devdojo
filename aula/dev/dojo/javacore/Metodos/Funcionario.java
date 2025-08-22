package aula.dev.dojo.javacore.Metodos;

public class Funcionario {
    private String nome;
    private double salario;
    private int idade;

    // Construtor
    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    // Getter para salário (necessário para média)
    public double getSalario() {
        return salario;
    }

    // Método para imprimir informações
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Idade: " + idade);
        System.out.println("-------------------------");
    }
}
