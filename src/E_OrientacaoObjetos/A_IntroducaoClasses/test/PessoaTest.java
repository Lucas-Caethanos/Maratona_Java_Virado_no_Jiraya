package E_OrientacaoObjetos.A_IntroducaoClasses.test;

// A classe Pessoa será usada para criar objetos que representam pessoas no código.
import E_OrientacaoObjetos.A_IntroducaoClasses.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        // Variável de referência 'pessoa01' do tipo Pessoa é usada para criar um objeto da classe Pessoa.
        // 'Pessoa' é o tipo do objeto, e 'pessoa01' é o nome da variável que fará referência ao objeto.
        Pessoa pessoa01 = new Pessoa();  // Criação do objeto pessoa01 da classe Pessoa.

        // Atribuindo valores aos atributos do objeto 'pessoa01'.
        // Definindo o nome da pessoa como "Lucas", idade como 15 e sexo como 'M' (Masculino).
        pessoa01.nome = "Lucas";
        pessoa01.idade = 15;
        pessoa01.sexo = 'M';

        System.out.println(pessoa01.nome);  // Exibe o nome da pessoa: Lucas
        System.out.println(pessoa01.idade);  // Exibe a idade da pessoa: 15
        System.out.println(pessoa01.sexo);  // Exibe o sexo da pessoa: M
    }
}
