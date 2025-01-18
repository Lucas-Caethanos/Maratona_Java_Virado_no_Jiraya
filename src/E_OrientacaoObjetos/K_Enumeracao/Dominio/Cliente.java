package E_OrientacaoObjetos.K_Enumeracao.Dominio;

// Classe Cliente que demonstra o uso de constantes para limitar valores válidos.
public class Cliente {

    // Atributos do cliente.
    private String nome;
    private String tipo;

    // Constantes para definir os tipos permitidos de cliente.
    public static final String PESSOA_FISICA = "PESSOA_FISICA"; // Representa clientes pessoa física.
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA"; // Representa clientes pessoa jurídica.

    // Construtor para inicializar um cliente com nome e tipo.
    public Cliente(String nome, String tipo) {

        // Validação para garantir que o tipo fornecido seja válido.
        if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
            // Caso o tipo não seja válido, define o nome fornecido e tipo como "Vazio".
            this.nome = nome;
            this.tipo = "Vazio";
        } else {
            // Caso o tipo seja válido, define normalmente o nome e o tipo fornecidos.
            this.nome = nome;
            this.tipo = tipo;
        }
    }

    // Sobrescrita do método_ toString() para exibir informações do cliente.
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
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
    public String getTipo() {
        return tipo;
    }

    // Setter para modificar o tipo do cliente.
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
