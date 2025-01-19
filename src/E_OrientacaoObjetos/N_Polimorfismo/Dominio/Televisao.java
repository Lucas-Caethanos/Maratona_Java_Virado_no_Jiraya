package E_OrientacaoObjetos.N_Polimorfismo.Dominio;

// Classe Televisao que estende a classe abstrata Produto.
// Representa um tipo específico de produto com uma lógica de cálculo de imposto própria.
public class Televisao extends Produto {

    // Constante que define a taxa de imposto para televisores.
    public static final double IMPOSTO = 0.20;

    // Construtor que chama o construtor da superclasse para inicializar os atributos nome e valor.
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    // Implementação do método_ calcularImposto() definido na interface Taxavel.
    // Calcula o imposto com base no valor do produto e na taxa definida.
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão...");
        return this.valor * IMPOSTO;
    }

}
