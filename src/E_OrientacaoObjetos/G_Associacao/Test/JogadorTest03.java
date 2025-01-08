package E_OrientacaoObjetos.G_Associacao.Test;

import E_OrientacaoObjetos.G_Associacao.Dominio.Jogador;
import E_OrientacaoObjetos.G_Associacao.Dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        // Criação de três jogadores com nomes específicos
        Jogador jogador1 = new Jogador("Ichigo");
        Jogador jogador2 = new Jogador("Renji");
        Jogador jogador3 = new Jogador("Byakuya");

        // Criação de um array de jogadores
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        // Criação de um time chamado "Soul Society" e passando o array de jogadores como argumento
        Time time = new Time("Soul Society", jogadores);

        // Associando o jogador1 ao time "Soul Society"
        jogador1.setTime(time);

        // Imprime as informações do jogador1
        jogador1.imprime();

        System.out.println("--------------");

        // Imprime as informações do time
        time.imprime();
    }
}
