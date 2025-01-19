package E_OrientacaoObjetos.N_Polimorfismo.Dominio;

// Classe Tomate que estende a classe abstrata Produto.
// Representa um tipo específico de produto com uma lógica de cálculo de imposto própria.
public class Tomate extends Produto {

    // Constante que define a taxa de imposto para tomates.
    public static final double IMPOSTO = 0.06;

    // Atributo adicional específico para a classe Tomate.
    private String dataValidade;

    // Construtor que chama o construtor da superclasse para inicializar os atributos nome e valor.
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    // Implementação do método_ calcularImposto() definido na interface Taxavel.
    // Calcula o imposto com base no valor do produto e na taxa definida.
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * IMPOSTO;
    }

    // Getter para o atributo dataValidade.
    public String getDataValidade() {
        return dataValidade;
    }

    // Setter para o atributo dataValidade.
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
