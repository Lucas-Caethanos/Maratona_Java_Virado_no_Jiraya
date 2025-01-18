package E_OrientacaoObjetos.K_Enumeracao.Dominio;

// Classe ClienteComEnumNaClasse que utiliza enums internos para o tipo de cliente e tipo de pagamento.
public class ClienteComEnumNaClasse {

    // Enum TipoPagamento, com valores DEBITO e CREDITO, representados por valores inteiros.
    public enum TipoPagamento {
        DEBITO(1), CREDITO(2);

        // Valor associado a cada tipo de pagamento.
        public final int VALOR;

        // Construtor do enum que recebe o valor para cada tipo de pagamento.
        TipoPagamento(int VALOR) {
            this.VALOR = VALOR;
        }
    }

    // Atributos da classe ClienteComEnumNaClasse.
    private String nome;
    private TipoCliente tipoCliente;  // TipoCliente é outro enum (definido em algum outro lugar).
    private TipoPagamento tipoPagamento;  // Enum TipoPagamento definido acima.

    // Construtor para inicializar um cliente com nome, tipo de cliente e tipo de pagamento.
    public ClienteComEnumNaClasse(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    // Sobrescrita do método toString() para exibir informações sobre o cliente.
    @Override
    public String toString() {
        return "ClienteComEnumNaClasse{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamentoInt=" + tipoPagamento.VALOR +  // Exibindo o valor associado ao tipo de pagamento.
                '}';
    }
}
