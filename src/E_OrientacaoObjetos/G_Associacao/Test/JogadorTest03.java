package E_OrientacaoObjetos.G_Associacao.Test;

import E_OrientacaoObjetos.G_Associacao.dominio.Jogador;
import E_OrientacaoObjetos.G_Associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ichigo");
        Jogador jogador2 = new Jogador("Renji");
        Jogador jogador3 = new Jogador("Byakuya");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time = new Time("Soul Society", jogadores);

        jogador1.setTime(time);

        jogador1.imprime();

        System.out.println("--------------");

        time.imprime();

    }
}
