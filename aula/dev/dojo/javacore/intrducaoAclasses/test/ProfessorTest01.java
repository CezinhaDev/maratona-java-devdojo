package aula.dev.dojo.javacore.intrducaoAclasses.test;

import aula.dev.dojo.javacore.intrducaoAclasses.dominio.Professor; // importa o objeto

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor(); // criando o objeto
        professor.nome = "MESTRE CESAR";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade:  " + professor.idade + " " + professor.sexo);

    }
}
