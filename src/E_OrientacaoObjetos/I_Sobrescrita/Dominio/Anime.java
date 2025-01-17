package E_OrientacaoObjetos.I_Sobrescrita.Dominio;

// Classe Anime que representa um objeto com um atributo 'nome'.
public class Anime {

    // Atributo privado para armazenar o nome do anime.
    private String nome;

    // Construtor que inicializa o atributo 'nome' com o valor fornecido.
    public Anime(String nome) {
        this.nome = nome;
    }

    // Sobrescrita do método_ toString() para personalizar como o objeto é representado como uma String.
    @Override
    public String toString() {
        // Retorna uma representação personalizada do objeto.
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    // Getter para obter o valor do atributo 'nome'.
    public String getNome() {
        return nome;
    }

    // Setter para modificar o valor do atributo 'nome'.
    public void setNome(String nome) {
        this.nome = nome;
    }
}
