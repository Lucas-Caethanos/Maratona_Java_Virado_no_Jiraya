package C_EstruturasRepeticao;

public class estruRep01 {
    public static void main(String[] args) {

        int count = 0; // Variável de controle inicializada com 0.

        // Exemplo de estrutura de repetição WHILE.
        // Enquanto 'count' for menor que 10, o bloco de código será executado.
        while (count < 10) {
            // Incrementa 'count' antes de imprimir (pré-incremento).
            System.out.println("while " + ++count);
        }

        // Exemplo de estrutura DO-WHILE.
        // Executa o bloco de código pelo menos uma vez, mesmo que a condição seja falsa.
        do {
            // Exibe uma mensagem indicando que está dentro do DO-WHILE.
            System.out.println("Dentro do do-while, executada pelo menos uma vez");

        } while (count > 10); // Condição é falsa, então executa o bloco apenas uma vez.

        // Exemplo de estrutura FOR.
        // Itera de 0 até 9 (10 vezes), incrementando 'i' a cada repetição.
        for (int i = 0; i < 10; i++) {
            // Exibe o valor atual de 'i'.
            System.out.println("For " + i);
        }

    }
}
