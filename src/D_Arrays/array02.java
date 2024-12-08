package D_Arrays;

public class array02 {
    public static void main(String[] args) {

        // Inicializando diretamente o array de Strings com 3 elementos: "Goku", "Naruto" e "Ichigo".
        // A linha abaixo é equivalente à inicialização que foi comentada.
        String[] nomes = {"Goku", "Naruto", "Ichigo"};

        // Abaixo estão duas formas de percorrer o array e imprimir os valores.

        // Usando um loop for tradicional para percorrer o array "nomes" e imprimir cada nome.
        // O índice 'i' vai de 0 até o comprimento do array (nomes.length), que é 3.
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]); // Exibe o nome no índice 'i' do array.
        }

        System.out.println("--------------------");

        // Usando um loop for-each (enhanced for loop) para percorrer o array "nomes" e imprimir cada elemento.
        // A variável 'num' recebe o valor de cada elemento do array durante cada iteração.
        for (String num : nomes) {
            System.out.println(num); // Exibe o nome contido na variável 'num'.
        }
    }
}
