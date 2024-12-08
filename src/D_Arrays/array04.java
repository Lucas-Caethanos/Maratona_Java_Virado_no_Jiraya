package D_Arrays;

public class array04 {
    public static void main(String[] args) {

        // Declarando um array multidimensional com 3 linhas.
        // Porém, a quantidade de colunas de cada linha não é definida neste momento.
        int[][] arrayList = new int[3][];

        // Inicializando o primeiro array (arrayList[0]) com 2 elementos.
        arrayList[0] = new int[2]; // Agora arrayList[0] é um array de 2 elementos (valores padrão 0).

        // Inicializando o segundo array (arrayList[1]) com 3 elementos específicos: 1, 2 e 3.
        arrayList[1] = new int[]{1, 2, 3}; // Agora arrayList[1] é um array de 3 elementos: {1, 2, 3}.

        // Inicializando o terceiro array (arrayList[2]) com 4 elementos (valores padrão 0).
        arrayList[2] = new int[4]; // Agora arrayList[2] é um array de 4 elementos (valores padrão 0).

        // Usando um loop for-each para percorrer o array de arrays (arrayList).
        for (int[] arr : arrayList) {  // 'arr' será cada array (linha) dentro de arrayList.
            System.out.println(); // Quebra de linha entre os arrays.
            System.out.println("-----------------");  // Delimitação visual entre os arrays.
            for (int num : arr) {  // Para cada número dentro do array 'arr'.
                System.out.print(num + " ");  // Exibe o número com um espaço.
            }
        }
    }
}
