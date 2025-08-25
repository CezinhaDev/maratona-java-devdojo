package aula.dev.dojo.javacore.Metodos;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    // Getters e Setters, sao para acessar os atributos privados
    // set é para definir o valor
    // get é para obter o valor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

}
