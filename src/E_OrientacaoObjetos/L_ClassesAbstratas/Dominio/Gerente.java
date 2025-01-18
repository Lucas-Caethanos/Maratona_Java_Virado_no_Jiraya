package E_OrientacaoObjetos.L_ClassesAbstratas.Dominio;

public class Gerente extends Funcionario {

    // Construtor da classe Gerente, que chama o construtor da classe pai (Funcionario)
    public Gerente(String nome, double salario) {
        super(nome, salario); // Chama o construtor da classe Funcionario
    }

    // Implementação do método_ calculaBonus para o Gerente
    @Override
    public void calculaBonus() {
        // O bônus para gerentes é 10% do salário
        this.salario = salario + salario * 0.1;
    }

    // Método_ para imprimir detalhes específicos do Gerente
    @Override
    public void Imprime() {
        System.out.println("Imprimindo Gerente: " + toString());
    }
}
