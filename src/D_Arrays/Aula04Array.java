package D_Arrays;

public class Aula04Array {
    public static void main(String[] args) {

        //Podemos referenciar diferentes array em um array base
        int[][] arrayList = new int[3][];

        arrayList[0] = new int[2]; //inicialisando um array[2] na posição de outro array (arrayList[0])
        arrayList[1] = new int[]{1,2,3};
        arrayList[2] = new int[4];


        for (int[] arr: arrayList){
            System.out.println();
            System.out.println("-----------------");
            for(int num: arr){
                System.out.print(num + " ");
            }
        }
    }
}
