package E_OrientacaoObjetos.K_Enumeracao.Dominio;

// Classe ClienteComEnum que utiliza um enum para o tipo do cliente.
public class ClienteComEnum {
    // Atributos do cliente: nome e tipoCliente.
    private String nome;
    private TipoCliente tipoCliente;

    // Construtor para inicializar o cliente com nome e tipo.
    public ClienteComEnum(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    // Sobrescrita do método_ toString() para exibir as informações do cliente.
    @Override
    public String toString() {
        return "ClienteComEnum{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    // Getter para obter o nome do cliente.
    public String getNome() {
        return nome;
    }

    // Setter para modificar o nome do cliente.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para obter o tipo do cliente.
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    // Setter para modificar o tipo do cliente.
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
