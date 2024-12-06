package E_OrientacaoObjetos.C_SobrecargaMetodos.Test;

import E_OrientacaoObjetos.C_SobrecargaMetodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //Inicializando os atributos por um método único
        anime.init("Bleach", "TV", 135);
        anime.init("Bleach", "TV", 135, "Ação");

//        anime.setNome("Bleach");
//        anime.setTipo("TV");
//        anime.setEpisodios(135);
        anime.imprime();


    }
}
