package E_OrientacaoObjetos.N_Polimorfismo.Dominio;

// Classe abstrata Produto que implementa a interface Taxavel.
// Serve como base para produtos específicos e define atributos e métodos comuns.
public abstract class Produto implements Taxavel {
    // Atributos protegidos, acessíveis por subclasses.
    protected String nome;
    protected double valor;

    // Construtor para inicializar os atributos nome e valor.
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // Método_ para obter o nome do produto.
    public String getNome() {
        return nome;
    }

    // Método_ para obter o valor do produto.
    public double getValor() {
        return valor;
    }
}
