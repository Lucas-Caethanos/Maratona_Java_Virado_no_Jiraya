package E_OrientacaoObjetos.H_Heranca.Dominio;

// A classe Funcionario herda da classe Pessoa, utilizando o conceito de herança.
public class Funcionario extends Pessoa {
    // Atributo privado específico da classe Funcionario.
    private double salario;

    // Método_ para imprimir as informações do funcionário.
    public void imprime() {

        // Chama o método_ imprime() da classe Pessoa usando 'super'.
        super.imprime();
        // Imprime o salário do funcionário.
        System.out.println(this.salario);
    }

    // Bloco estático: executado apenas uma vez, quando a classe Funcionario é carregada pela JVM.
    static {
        System.out.println("Dentro do bloco estático de Funcionário");
    }

    // Primeiro bloco de inicialização de instância: executado sempre que um objeto Funcionario é criado.
    {
        System.out.println("Bloco de inicialização 1 Funcionário");
    }

    // Segundo bloco de inicialização de instância: executado logo após o primeiro bloco.
    {
        System.out.println("Bloco de inicialização 2 Funcionário");
    }

    // Construtor da classe Funcionario, que recebe o nome e o salário como parâmetros.
    public Funcionario(String nome, double salario) {

        // Chama o construtor da classe Pessoa, inicializando o atributo 'nome'.
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
        // Inicializa o atributo 'salario' com o valor passado.
        this.salario = salario;
    }

    // Getter para acessar o valor do salário.
    public double getSalario() {
        return salario;
    }

    // Setter para modificar o valor do salário.
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
