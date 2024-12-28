package E_OrientacaoObjetos.F_ModificadoresEstatico.Test;

import E_OrientacaoObjetos.F_ModificadoresEstatico.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        // Criando a primeira instância da classe Anime
        // O bloco de inicialização estático será executado antes deste construtor, apenas na primeira vez que a classe Anime for carregada.
        Anime anime1 = new Anime();

        // Criando a segunda instância da classe Anime
        // O bloco de inicialização estático não será executado novamente, pois já foi chamado quando a classe foi carregada.
        Anime anime2 = new Anime();

        // Criando a terceira instância da classe Anime
        // Mais uma vez, o bloco de inicialização estático não será chamado, mas o construtor será executado para inicializar esta nova instância.
        Anime anime3 = new Anime();
    }
}
