package D_Arrays;

public class array03 {
    public static void main(String[] args) {

        // Criando uma matriz 3x3 de inteiros.
        // A matriz 'dias' terá 3 linhas e 3 colunas.
        int[][] dias = new int[3][3];

        // Atribuindo valores específicos aos elementos da matriz "dias".
        dias[0][0] = 15; // Linha 0, Coluna 0
        dias[0][1] = 95; // Linha 0, Coluna 1
        dias[0][2] = 63; // Linha 0, Coluna 2

        dias[1][0] = 18; // Linha 1, Coluna 0
        dias[1][1] = 35; // Linha 1, Coluna 1
        dias[1][2] = 16; // Linha 1, Coluna 2

        dias[2][0] = 74; // Linha 2, Coluna 0
        dias[2][1] = 115; // Linha 2, Coluna 1
        dias[2][2] = 395; // Linha 2, Coluna 2

        // O código comentado abaixo percorre a matriz utilizando um loop tradicional (for).
        // Ele percorre as linhas e dentro de cada linha, percorre as colunas, imprimindo o valor.
        /*
        for (int i = 0; i < dias.length; i++) {  // Percorre as linhas
            for (int j = 0; j < dias[0].length; j++) {  // Percorre as colunas
                System.out.print("Tabela " + (i+1) + ":" + dias[i][j] + ", ");
            }
            System.out.println();  // Quebra de linha após cada linha da matriz
        }
        */

        // Usando um loop for-each para percorrer o array multidimensional "dias"
        // O loop externo percorre as linhas da matriz, e o loop interno percorre os elementos de cada linha.
        for (int[] arr: dias) {  // Percorre cada linha da matriz
            for (int num: arr) {  // Percorre os elementos da linha
                System.out.println(num);  // Imprime o valor do elemento
            }
        }

    }
}
