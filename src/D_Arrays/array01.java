package D_Arrays;

public class array01 {
    public static void main(String[] args) {
        // Um array de inteiros "idades" é declarado e inicializado com tamanho 3.
        // Por padrão, em Java, os valores dos elementos de arrays de inteiros são inicializados como 0.
        int[] idades = new int[3];

        // Atribuindo valores específicos aos elementos do array "idades".
        idades[0] = 21; // Atribuindo 21 ao índice 0.
        idades[1] = 15; // Atribuindo 15 ao índice 1.
        idades[2] = 12; // Atribuindo 12 ao índice 2.

        // Declarando um array de booleanos "verdade" com tamanho 1.
        // Por padrão, arrays de booleanos são inicializados com "false".
        boolean[] verdade = new boolean[1];

        // Exibe no console o valor do único elemento no array "verdade".
        // Como nenhum valor foi atribuído, ele imprime o valor padrão "false".
        System.out.println(verdade[0]); // Saída: false

        System.out.println(idades[0]);
    }
}
