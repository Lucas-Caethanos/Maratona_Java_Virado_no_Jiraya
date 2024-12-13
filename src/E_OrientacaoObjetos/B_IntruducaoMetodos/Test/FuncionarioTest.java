package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        // Criação de uma instância da classe Funcionario
        Funcionario funcionario01 = new Funcionario();

        // Inicialização dos atributos
        funcionario01.nome = "Ichigo";                // Atribuindo o nome "Ichigo"
        funcionario01.idade = 15;                    // Atribuindo a idade 15
        funcionario01.salario = new double[]{40.52, 45.52, 51.52}; // Inicializando o array de salários

        // Exibe um separador para facilitar a leitura da saída
        System.out.println("--------------------");

        // Chamando os métodos da classe Funcionario
        funcionario01.imprime();                     // Imprime os atributos do objeto
        funcionario01.mediaSalario();               // Calcula e imprime a média dos salários
    }
}
