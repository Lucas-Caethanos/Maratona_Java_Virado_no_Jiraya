package E_OrientacaoObjetos.H_Heranca.Dominio;

// Classe Pessoa, que serve como classe base para outras classes.
// Contém atributos comuns (nome, cpf, endereço) e métodos relacionados a eles.
public class Pessoa {

    // Atributos protegidos, permitindo acesso em subclasses e no mesmo pacote.
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    // Método_ para imprimir informações da pessoa.
    public void imprime() {

        System.out.println(this.nome);
        System.out.println(this.cpf);

        // Imprime o endereço no formato "rua, CEP".
        System.out.println(this.endereco.getRua() + " ," + this.endereco.getCep());
    }

    // Bloco estático: executado apenas uma vez, quando a classe é carregada pela JVM.
    static {
        System.out.println("Dentro do bloco estático de Pessoa");
    }

    // Bloco de inicialização de instância: executado assim que uma instância da classe é criada.
    {
        System.out.println("Bloco de inicialização 1");
    }

    // Outro bloco de inicialização de instância: executado logo após o bloco anterior.
    {
        System.out.println("Bloco de inicialização 2");
    }

    // Construtor da classe Pessoa, usado para inicializar o atributo nome.
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome; // Atribui o nome passado como parâmetro ao atributo da classe.
    }

    // Métodos getters e setters para acessar e modificar os atributos.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
