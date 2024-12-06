package E_OrientacaoObjetos.H_Heranca.Dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    static {
        System.out.println("Dento do bloso estático de Funcionário");
    }

    {
        System.out.println("Bloco de inicialização 1 Funcionário");
    }
    {
        System.out.println("Bloco de inicialização 2 Funcionário");
    }

    public Funcionario(String nome, double salario) {
        super(nome);
        System.out.println("Dentro construtor de Funcionário");
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
