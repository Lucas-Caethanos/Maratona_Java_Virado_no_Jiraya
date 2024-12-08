package C_EstruturasRepeticao;

public class estruRep02 {
    public static void main(String[] args) {

        // Estrutura FOR para iterar de 0 até 100.
        for (int i = 0; i <= 100; i++) {

            // Verifica se o número atual (i) é par (divisível por 2 sem resto).
            if (i % 2 == 0) {
                // Se for par, imprime o número.
                System.out.println(i);

                // Verifica se 'i' atingiu ou ultrapassou a metade de 100 (50).
                if (i >= (100 / 2)) {
                    // Se a condição for verdadeira, interrompe o loop.
                    break;
                }
            }
        }

    }
}
