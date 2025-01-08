package E_OrientacaoObjetos.G_Associacao.Dominio;

public class Jogador {
    private String nome; // Nome do jogador

    // Criando a relação entre a classe Jogador e a classe Time
    private Time time; // Associação com a classe Time (um jogador pertence a um time)

    // Método_ para imprimir os dados do jogador e do time associado
    public void imprime() {
        System.out.println(this.nome); // Imprime o nome do jogador

        // Verifica se o jogador está associado a um time
        if (time != null) {
            System.out.println(time.getNome()); // Imprime o nome do time
        } else {
            System.out.println("O jogador não tem time"); // Mensagem caso não exista um time associado
        }
    }

    // Construtor que inicializa o jogador com um nome
    public Jogador(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo time (permite acessar o time associado)
    public Time getTime() {
        return time;
    }

    // Setter para o atributo time (permite associar um time ao jogador)
    public void setTime(Time time) {
        this.time = time;
    }

    // Getter para o atributo nome (permite acessar o nome do jogador)
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome (permite alterar o nome do jogador)
    public void setNome(String nome) {
        this.nome = nome;
    }
}
