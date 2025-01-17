package E_OrientacaoObjetos.H_Heranca.Test;

// Importa a classe Funcionario para ser usada no teste.
import E_OrientacaoObjetos.H_Heranca.Dominio.Funcionario;

// Classe de teste para verificar o comportamento da classe Funcionario.
public class HerancaTest02 {
    public static void main(String[] args) {
        // Cria uma instância da classe Funcionario utilizando o construtor.
        Funcionario funcionario = new Funcionario("Urahara", 894.778);

        // No momento da criação do objeto, o seguinte ocorre:
        // 1. O bloco estático de Pessoa é executado (se ainda não foi).
        // 2. O bloco estático de Funcionario é executado (se ainda não foi).
        // 3. Os blocos de inicialização de Pessoa são executados em ordem.
        // 4. O construtor de Pessoa é chamado para inicializar o atributo 'nome'.
        // 5. Os blocos de inicialização de Funcionario são executados em ordem.
        // 6. O construtor de Funcionario é executado para inicializar o atributo 'salario'.

        // Neste caso, nenhum método adicional foi chamado, então o comportamento
        // do programa é limitado à execução dos blocos e do construtor.
    }
}
