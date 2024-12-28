package E_OrientacaoObjetos.F_ModificadoresEstatico.Dominio;

public class Anime {
    // Atributo de instância para armazenar o nome do anime
    private String nome;

    // Atributo estático para armazenar os episódios. Este atributo é compartilhado entre todas as instâncias da classe.
    private static int[] episodios;

    // Bloco de inicialização estático
    // Este bloco será executado apenas uma vez, quando a classe for carregada pela JVM, antes de qualquer instância ser criada.
    static {
        System.out.println("Dentro do bloco de inicialização");
    }

    // Construtor da classe Anime
    public Anime() {
        // Inicializando o array de episódios com 50 posições
        episodios = new int[50];

        // Preenchendo o array com os números dos episódios (de 1 a 50)
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1; // Cada elemento recebe o índice + 1
        }

        // Iterando sobre o array de episódios e imprimindo os valores
        for (int ep : episodios) {
            System.out.print(ep + " "); // Exibe os números dos episódios no console
        }
    }
}

