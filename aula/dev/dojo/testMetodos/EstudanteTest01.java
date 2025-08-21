package aula.dev.dojo.testMetodos;

import aula.dev.dojo.javacore.Metodos.Estudante;
import aula.dev.dojo.javacore.Metodos.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // oque esta acontecendo aqui?
        // aqui nos temos 2 objetos do tipo Estudante
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        // Atribuindo valores aos atributos dos objetos
        impressoraEstudante impressora = new impressoraEstudante();

        
        estudante.nome = "Cesar";
        estudante.idade = 30;
        estudante.sexo = 'M';

        estudante2.nome = "Ana";
        estudante2.idade = 25;
        estudante2.sexo = 'F';

        
        impressora.imprimeEstudante(estudante2);
        impressora.imprimeEstudante(estudante);
    }
}