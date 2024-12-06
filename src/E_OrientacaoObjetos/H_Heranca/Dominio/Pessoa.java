package E_OrientacaoObjetos.H_Heranca.Dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " ," + this.endereco.getCep());
    }

    static {
        System.out.println("Dento do bloso estático de pessoa");
    }
    {
        System.out.println("Bloco de inicialização 1");
    }
    {
        System.out.println("Bloco de inicialização 2");
    }
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

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
///https://www.youtube.com/watch?v=64GcJDKN4mI&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=75