package E_OrientacaoObjetos.K_Enumeracao.Dominio;

public class ClienteComEnumNaClasse {

    public enum TipoPagamento{
        DEBITO(1), CREDITO(2);
        public final int VALOR;

        TipoPagamento(int VALOR) {
            this.VALOR = VALOR;
        }


    }

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public ClienteComEnumNaClasse(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "ClienteComEnumNaClasse{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoPagamentoInt=" + tipoPagamento.VALOR +
                '}';
    }
}
