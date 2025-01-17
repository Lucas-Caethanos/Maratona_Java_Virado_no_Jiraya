package E_OrientacaoObjetos.H_Heranca.Test;

// Importa as classes necessárias para o teste.
import E_OrientacaoObjetos.H_Heranca.Dominio.Endereco;
import E_OrientacaoObjetos.H_Heranca.Dominio.Funcionario;
import E_OrientacaoObjetos.H_Heranca.Dominio.Pessoa;

// Classe principal para testar o conceito de herança e as classes criadas.
public class HerancaTest01 {
    public static void main(String[] args) {

        // Cria um objeto Endereco e define os valores para rua e cep.
        Endereco endereco = new Endereco();
        endereco.setRua("rua 3");
        endereco.setCep("48484");

        // Cria um objeto Pessoa utilizando o construtor que define o nome.
        Pessoa pessoa = new Pessoa("Ichigo Kurosaki");

        // Configura o endereço e o CPF para a pessoa.
        pessoa.setEndereco(endereco);
        pessoa.setCpf("8889485");

        // Cria um objeto Funcionario, que herda de Pessoa, com nome e salário inicial.
        Funcionario funcionario = new Funcionario("Oda Nobunaga", 2000);

        // Configura o endereço e o CPF para o funcionário.
        funcionario.setEndereco(endereco);
        funcionario.setCpf("984415");

        // Chama o método_ imprime() para a pessoa. Exibe nome, CPF e endereço.
        pessoa.imprime();
        System.out.println("---------------------------------");
        // Chama o método_ imprime() para o funcionário. Exibe nome, CPF, endereço e salário.
        funcionario.imprime();
    }
}
