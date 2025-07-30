package aula.dev.dojo.javacore.intrducaoAclasses.test;

import aula.dev.dojo.javacore.intrducaoAclasses.dominio.Estudante;

public class EstudanteTest01 {
  public static void main(String[] args) {
    // no caso ela faz referencia ao Estudante
    Estudante estudante = new Estudante();
    estudante.nome = "Cesar";
    estudante.idade = 21;
    estudante.sexo = 'M';
    System.out.println(estudante.nome);
    System.out.println(estudante.idade);
    System.out.println(estudante.sexo);
  }
}
