package E_OrientacaoObjetos.E_BlocosInicializacao.Dominio;

public class Anime {
    // Atributo privado que armazena o nome do anime
    private String nome;

    // Array para armazenar os números dos episódios
    private int[] episodios;

    // Bloco de inicialização de instância
    {
        // Este bloco é executado antes do construtor toda a vez que uma instância da classe é criada
        System.out.println("Dentro do bloco de inicialização");
    }

    // Construtor padrão da classe
    public Anime() {
        // Inicializa o array de episódios com tamanho 50
        System.out.println("Dentro do construtor");
        episodios = new int[50];

        // Preenche o array de episódios com números de 1 a 50
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1; // Define o número do episódio como i + 1
        }

        // Imprime todos os episódios armazenados no array
        for (int ep : episodios) {
            System.out.print(ep + " "); // Imprime cada número seguido de um espaço
        }
    }
}
