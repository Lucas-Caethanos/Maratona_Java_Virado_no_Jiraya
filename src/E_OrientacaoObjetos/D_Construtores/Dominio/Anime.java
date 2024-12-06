package E_OrientacaoObjetos.D_Construtores.Dominio;

import java.security.PublicKey;

public class Anime {
    public String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //Caso nã haja um cosntrutor o java cria um ao complilar a classe

    //Criando um construtor
    public Anime(String nome, String tipo, int episodios, String genero) {
        //É inicializado antes dos métodos
        this();
        System.out.println("Dentro do cosntrutor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome,tipo,episodios,genero); //chamando um cosntrutor dentro de outro construtor
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Cosntrutor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
