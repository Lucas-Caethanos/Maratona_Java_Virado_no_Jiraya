package E_OrientacaoObjetos.G_Associacao.Test;

import E_OrientacaoObjetos.G_Associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        //Array está fazendo referência à objetos em memória.
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
        System.out.println("-----------");

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprime();
        }


    }

}
