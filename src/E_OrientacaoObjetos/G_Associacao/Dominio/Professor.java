package E_OrientacaoObjetos.G_Associacao.Dominio;

public class Professor {
    private String nome; // Nome do professor

    // Construtor que inicializa o professor com um nome
    public Professor(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo nome (permite acessar o nome do professor)
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome (permite modificar o nome do professor)
    public void setNome(String nome) {
        this.nome = nome;
    }
}
