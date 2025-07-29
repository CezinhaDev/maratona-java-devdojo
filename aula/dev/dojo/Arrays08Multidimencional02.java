package aula.dev.dojo;

public class Arrays08Multidimencional02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        //inicializaçao

        arrayInt[0] = new int [2];
        arrayInt[1] = new int [3];
        arrayInt[2] =  new int [4];

        for(int[] arrayBase: arrayInt){
            for(int num : arrayBase){
                System.out.println(num);
            }
        }
    }
}
