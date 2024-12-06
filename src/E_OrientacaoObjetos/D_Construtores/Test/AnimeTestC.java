package E_OrientacaoObjetos.D_Construtores.Test;

import E_OrientacaoObjetos.D_Construtores.Dominio.Anime;

public class AnimeTestC {
    public static void main(String[] args) {

        //Inicializamos o objeeto e já passando os parâmetros
        Anime anime = new Anime("Bleach","TV",152,"Shounem", "Mappa");
        anime.imprime();
    }
}