package aula.dev.dojo.javacore.Metodos;

public class impressoraEstudante {
    public void imprimeEstudante(Estudante estudante) {
        System.out.println("===================");
        
        estudante.idade = 30;
        estudante.sexo = 'M';
        System.out.println(estudante.nome + " tem " + estudante.idade + " anos e é do sexo " + estudante.sexo);
        estudante.nome = "Cesar";
    }
}
