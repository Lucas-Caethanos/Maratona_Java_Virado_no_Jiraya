package E_OrientacaoObjetos.L_ClassesAbstratas.Dominio;

// Classe Desenvolvedor que herda de Funcionario (presumidamente uma classe abstrata).
public class Desenvolvedor extends Funcionario {

    // Construtor que chama o construtor da classe pai (Funcionario) para inicializar nome e salário.
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    // Sobrescrita do método_ calculaBonus, específico para a classe Desenvolvedor.
    @Override
    public void calculaBonus() {
        // Calcula o bônus como 5% do salário e atualiza o salário do desenvolvedor.
        this.salario = salario + salario * 0.05;
    }

    // Sobrescrita do método_ Imprime, que imprime uma mensagem específica para a classe Desenvolvedor.
    @Override
    public void Imprime() {
        // Imprime uma mensagem informando que o método_ Imprime foi chamado.
        System.out.println("Imprimindo...");
    }
}
