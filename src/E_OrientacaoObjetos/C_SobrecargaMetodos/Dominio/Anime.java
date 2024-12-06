package E_OrientacaoObjetos.C_SobrecargaMetodos.Dominio;

public class Anime {
    public String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //Método sobrescrito
    public void init(String nome, String tipo, int episodios, String genero) {
        //Chamando um método antigo no método sobrescrito
        this.init(nome, tipo, episodios);

        //this.nome = nome;
        //this.tipo = tipo;
        //this.episodios = episodios;
        this.genero = genero;
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
}
