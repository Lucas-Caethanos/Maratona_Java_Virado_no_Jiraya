package E_OrientacaoObjetos.J_ModificadorFinal.Dominio;

// Definindo a classe Carro, que possui atributos e comportamentos de um carro.
public class Carro {

    private String nome;

    // 'COMPRADOR' é um atributo final, o que significa que a referência para esse objeto não pode ser alterada depois de inicializada.
    // Aqui estamos criando uma nova instância da classe Comprador.
    public final Comprador COMPRADOR = new Comprador();

    // 'VELOCIDADE_LIMITE' é uma constante estática (compartilhada entre todas as instâncias da classe).
    // A constante está sendo definida em letras maiúsculas e separada por _ (convenção de nomenclatura de constantes).
    // O valor será atribuído dentro de um bloco estático.
    public static final double VELOCIDADE_LIMITE;

    // Bloco estático: Esse bloco é executado quando a classe Carro é carregada pela primeira vez na memória.
    // É utilizado para inicializar variáveis estáticas. Aqui, estamos definindo o valor da constante VELOCIDADE_LIMITE.
    static {
        VELOCIDADE_LIMITE = 250; // A constante VELOCIDADE_LIMITE é inicializada com o valor 250.
    }

    // Método_ getter para o atributo 'nome'. Retorna o valor atual do nome do carro.
    public String getNome() {
        return nome;
    }

    // Método_ setter para o atributo 'nome'. Atribui um novo valor ao nome do carro.
    public void setNome(String nome) {
        this.nome = nome;
    }
}
