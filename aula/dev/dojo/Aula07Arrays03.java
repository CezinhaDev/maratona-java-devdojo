package aula.dev.dojo;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};


      /*   for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
            */

        for (int i : numeros2) { // isso é um forech, mesma coisa so que sintaxe diferente
            System.out.println(i);
        }
    }
}
