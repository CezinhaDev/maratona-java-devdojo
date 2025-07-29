package aula.dev.dojo;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31, 28, 31, 30 dias
        int[][] dias = new int[3][3]; //
        System.out.println(dias[0][0]);

        dias[0][0] = 10;
        dias[0][1] = 20;
        dias[0][2] = 30;

        dias[1][0] = 40;
        dias[1][1] = 50;
        dias[1][2] = 60;

        dias[2][0] = 70;
        dias[2][1] = 80;
        dias[2][2] = 90;

        

        for (int[] arrayBase : dias) {
            for ( int num: arrayBase){
                System.out.println(num);
            }
        }

    }
}
