package aula.dev.dojo.javacore.Metodos;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("===================");
        System.out.println(this.nome + " tem " + this.idade + " anos e é do sexo " + this.sexo);
    }
}
