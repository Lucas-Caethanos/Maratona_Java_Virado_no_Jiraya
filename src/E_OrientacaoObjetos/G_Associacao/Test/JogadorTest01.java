package E_OrientacaoObjetos.G_Associacao.Test;

import E_OrientacaoObjetos.G_Associacao.Dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        // Criando objetos Jogador com nomes específicos
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        // Array armazenando referências aos objetos Jogador criados
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        // Iteração usando um laço "for-each" para imprimir os dados de cada jogador
        for (Jogador jogador : jogadores) {
            jogador.imprime(); // Chama o método_ imprime() para cada jogador
        }
        System.out.println("-----------"); // Separador para a próxima seção de impressão

        // Iteração usando um laço "for" tradicional para imprimir os dados de cada jogador
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprime(); // Chama o método_ imprime() para cada jogador
        }
    }
}
