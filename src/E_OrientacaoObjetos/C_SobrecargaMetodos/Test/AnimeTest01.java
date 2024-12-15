package E_OrientacaoObjetos.C_SobrecargaMetodos.Test;

// Importa a classe Anime do pacote indicado
import E_OrientacaoObjetos.C_SobrecargaMetodos.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        // Criação de uma nova instância da classe Anime
        Anime anime = new Anime();

        // Inicializando os atributos utilizando o método_ init com 3 parâmetros
        anime.init("Bleach", "TV", 135);

        // Inicializando novamente, agora com 4 parâmetros (sobrecarga do método_ init)
        // O método_ init com 4 parâmetros chama o init com 3 parâmetros e adiciona o 'gênero'
        anime.init("Bleach", "TV", 135, "Ação");

        // Comentário: Este trecho foi substituído pela utilização do método_ init
        // Inicialização manual por setters (não usada aqui, mas também válida)
        // anime.setNome("Bleach");
        // anime.setTipo("TV");
        // anime.setEpisodios(135);

        // Chama o método_ imprime para exibir as informações do anime
        anime.imprime();
    }
}
