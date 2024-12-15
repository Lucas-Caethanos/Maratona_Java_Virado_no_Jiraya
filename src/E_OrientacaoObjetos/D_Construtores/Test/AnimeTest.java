package E_OrientacaoObjetos.D_Construtores.Test;

import E_OrientacaoObjetos.D_Construtores.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        // Criando uma instância da classe Anime e inicializando os atributos diretamente pelo construtor com 5 parâmetros
        Anime anime = new Anime("Bleach", "TV", 152, "Shounen", "Mappa");

        // Chamando o método_ imprime para exibir os valores dos atributos da instância
        anime.imprime();
    }
}
