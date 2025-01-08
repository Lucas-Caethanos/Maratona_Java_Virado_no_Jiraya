package E_OrientacaoObjetos.G_Associacao.Test;

import E_OrientacaoObjetos.G_Associacao.Dominio.Jogador;
import E_OrientacaoObjetos.G_Associacao.Dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        // Cria um objeto Jogador com o nome "Ichigo"
        Jogador jogador1 = new Jogador("Ichigo");

        // Cria um objeto Time com o nome "Soul Society"
        Time time1 = new Time("Soul Society");

        // Exibe as informações do jogador antes de associá-lo a um time
        System.out.println("Antes de atribuir um time");
        jogador1.imprime();

        // Associa o jogador ao time "Soul Society"
        jogador1.setTime(time1);

        // Exibe as informações do jogador após associá-lo ao time
        System.out.println("------------------");
        System.out.println("Depois de atribuir um time");
        jogador1.imprime();
    }
}
