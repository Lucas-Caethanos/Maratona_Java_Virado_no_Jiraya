package E_OrientacaoObjetos.G_Associacao.Test;

import E_OrientacaoObjetos.G_Associacao.dominio.Jogador;
import E_OrientacaoObjetos.G_Associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ichigo");
        Time time1 = new Time("Soul Society");

        System.out.println("Antes de atribuir um time");
        jogador1.imprime();

        //Atribuindo um objeto time para um objeto jogador.
        jogador1.setTime(time1);

        System.out.println("------------------");

        System.out.println("Depois de atribuir um time");
        jogador1.imprime();

    }
}
