package D_Arrays;

public class Aula03Array {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 15;
        dias[0][1] = 95;
        dias[0][2] = 63;

        dias[1][0] = 18;
        dias[1][1] = 35;
        dias[1][2] = 16;

        dias[2][0] = 74;
        dias[2][1] = 115;
        dias[2][2] = 395;

//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[0].length; j++) {
//                System.out.print("Tabela " + (i+1) + ":" + dias[i][j] + ", ");
//            }
//            System.out.println();
//
//        }

        for (int[] arr: dias) {
            for (int num: arr){
                System.out.println(num);
            }
        }

    }
}
