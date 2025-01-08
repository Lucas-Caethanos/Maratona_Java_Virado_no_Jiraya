package E_OrientacaoObjetos.G_Associacao.Dominio;

public class Time {
    private String nome; // Nome do time

    // Associação: um time pode ter vários jogadores
    private Jogador[] jogadores;

    // Construtor que inicializa o time com apenas um nome
    public Time(String nome) {
        this.nome = nome;
    }

    // Construtor sobrecarregado que inicializa o time com um nome e uma lista de jogadores
    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    // Método_ para imprimir os dados do time e dos jogadores associados
    public void imprime() {
        System.out.println(this.nome); // Imprime o nome do time

        // Verifica se há jogadores associados antes de iterar
        if (jogadores != null) {
            for (Jogador jogador : jogadores) { // Itera sobre o array de jogadores
                System.out.println(jogador.getNome()); // Imprime o nome de cada jogador
            }
        } else {
            return; // Se não há jogadores, encerra o método_ sem imprimir nada adicional
        }
    }

    // Getter para o atributo nome (permite acessar o nome do time)
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome (permite alterar o nome do time)
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo jogadores (permite acessar os jogadores associados ao time)
    public Jogador[] getJogadors() {
        return jogadores;
    }

    // Setter para o atributo jogadores (permite associar novos jogadores ao time)
    public void setJogadors(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
