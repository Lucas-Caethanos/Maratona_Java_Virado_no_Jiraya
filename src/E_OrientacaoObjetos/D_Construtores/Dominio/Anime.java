package E_OrientacaoObjetos.D_Construtores.Dominio;

// Classe 'Anime' com atributos e construtores para inicialização
public class Anime {
    // Atributos da classe
    public String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    // Comentário: Caso nenhum construtor seja declarado, o Java cria automaticamente um construtor padrão sem argumentos.

    // Construtor com 4 parâmetros para inicializar 'nome', 'tipo', 'episodios' e 'genero'
    public Anime(String nome, String tipo, int episodios, String genero){
        this(); // Chama o construtor sem argumentos para executar ações iniciais
        System.out.println("Dentro do construtor com 4 argumentos"); // Mensagem de debug
        this.nome = nome; // Inicializa o atributo 'nome'
        this.tipo = tipo; // Inicializa o atributo 'tipo'
        this.episodios = episodios; // Inicializa o atributo 'episodios'
        this.genero = genero; // Inicializa o atributo 'genero'
    }

    // Construtor com 5 parâmetros, incluindo o atributo adicional 'estudio'
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero); // Reutiliza o construtor de 4 parâmetros
        this.estudio = estudio; // Inicializa o atributo 'estudio'
    }

    // Construtor sem argumentos
    public Anime() {
        System.out.println("Construtor sem argumentos"); // Mensagem de debug
    }

    // Método_ para imprimir os atributos da instância
    public void imprime() {
        System.out.println(this.nome); // Exibe o atributo 'nome'
        System.out.println(this.tipo); // Exibe o atributo 'tipo'
        System.out.println(this.episodios); // Exibe o atributo 'episodios'
        System.out.println(this.genero); // Exibe o atributo 'genero'
        System.out.println(this.estudio); // Exibe o atributo 'estudio'
    }

    // Métodos 'setter' e 'getter' para o atributo 'tipo'
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    // Métodos 'setter' e 'getter' para o atributo 'episodios'
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    // Métodos 'setter' e 'getter' para o atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    // Métodos 'setter' e 'getter' para o atributo 'genero'
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Métodos 'setter' e 'getter' para o atributo 'estudio'
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
