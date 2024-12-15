package E_OrientacaoObjetos.C_SobrecargaMetodos.Dominio;

// Classe que representa informações sobre um anime
public class Anime {
    // Atributos da classe
    public String nome;         // Nome do anime
    private String tipo;        // Tipo do anime (por exemplo, TV, OVA, Filme)
    private int episodios;      // Número de episódios do anime
    private String genero;      // Gênero do anime (por exemplo, ação, comédia)

    // Método_ para imprimir as informações do anime
    public void imprime() {
        // Usa 'this' para acessar os atributos da instância atual
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    // Método_ 'init' (inicializador) que configura os atributos 'nome', 'tipo' e 'episodios'
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;           // Inicializa o nome do anime
        this.tipo = tipo;           // Inicializa o tipo do anime
        this.episodios = episodios; // Inicializa o número de episódios
    }

    // Sobrecarga do método_ 'init', incluindo o atributo 'genero'
    public void init(String nome, String tipo, int episodios, String genero) {
        // Reutiliza o método_ 'init' com 3 parâmetros para evitar duplicação de código
        this.init(nome, tipo, episodios);

        // Configura o atributo 'genero' adicionalmente
        this.genero = genero;
    }

    // Métodos setters e getters para acessar e modificar os atributos de forma controlada

    // Setter para o atributo 'tipo'
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter para o atributo 'tipo'
    public String getTipo() {
        return this.tipo;
    }

    // Setter para o atributo 'episodios'
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    // Getter para o atributo 'episodios'
    public int getEpisodios() {
        return this.episodios;
    }

    // Setter para o atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo 'nome'
    public String getNome() {
        return this.nome;
    }

    // Getter para o atributo 'genero'
    public String getGenero() {
        return genero;
    }

    // Setter para o atributo 'genero'
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
