package aula.dev.dojo.javacore.Metodos;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+12);
    }

    public void subSoma(){
        System.out.println(10-5);
    }

    public void multiplicaNumeros(int num1, int num2){ // usando parametros
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(int num1, int num2){
        return num1/num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma dos elementos do array: " + soma);
    }


    public void somaVarArgs(int... numeros){ // varargs, aceita qualquer quantidade de parametros
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("Soma dos elementos do varargs: " + soma);
    }

    }
