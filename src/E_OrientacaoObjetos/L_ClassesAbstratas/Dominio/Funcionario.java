package E_OrientacaoObjetos.L_ClassesAbstratas.Dominio;

// Classe abstrata Funcionario que herda de Pessoa. Funciona como um molde para subclasses.
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    // Construtor que inicializa o nome e o salário do funcionário e chama o método_ calculaBonus.
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus(); // Chama o método_ calculaBonus, que deve ser implementado pelas subclasses.
    }

    // O toString foi herdado pelas subclasses e sobrescrito aqui para fornecer uma representação detalhada do Funcionario.
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Método_ abstrato que obriga todas as subclasses a implementarem sua própria lógica de cálculo de bônus.
    public abstract void calculaBonus();
}
