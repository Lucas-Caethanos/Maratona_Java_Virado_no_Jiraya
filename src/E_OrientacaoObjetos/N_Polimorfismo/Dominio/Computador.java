package E_OrientacaoObjetos.N_Polimorfismo.Dominio;

// Classe Computador que estende a classe abstrata Produto.
// Representa um tipo específico de produto com uma lógica de cálculo de imposto própria.
public class Computador extends Produto {

    // Constante que define a taxa de imposto para computadores.
    public static final double IMPOSTO = 0.20;

    // Construtor que chama o construtor da superclasse para inicializar os atributos nome e valor.
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    // Implementação do método_ calcularImposto() definido na interface Taxavel.
    // Calcula o imposto com base no valor do produto e na taxa definida.
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * IMPOSTO;
    }

}
