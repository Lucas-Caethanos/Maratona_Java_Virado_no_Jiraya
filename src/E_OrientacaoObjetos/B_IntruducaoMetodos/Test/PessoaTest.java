package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        // Criando um objeto 'pessoa' da classe 'Pessoa'
        Pessoa pessoa = new Pessoa();

        // pessoa.nome = "Ichigo";
        // pessoa.idade = 15;

        // Não podemos acessar diretamente os atributos 'nome' e 'idade', pois são privados.
        // Por isso, usamos os métodos setNome e setIdade para atribuir valores a esses atributos.

        // Atribuindo valores ao atributo 'nome' e 'idade' utilizando os setters.
        pessoa.setNome("Ichigo");
        pessoa.setIdade(15);

        // Acoplamento refere-se ao grau de dependência entre as classes.
        // A classe 'PessoaTest' precisa acessar a classe 'Pessoa' para manipular e exibir os dados do objeto.

        // Chamando o método_ 'imprime' da classe 'Pessoa' para imprimir os atributos 'nome' e 'idade'.
        pessoa.imprime();

        // Imprimindo uma linha de separação para melhorar a leitura do console.
        System.out.println("------------------------------");

        // Usando os métodos 'getNome' e 'getIdade' para acessar e imprimir os atributos 'nome' e 'idade' diretamente.
        System.out.println(pessoa.getNome()); // Exibe "Ichigo"
        System.out.println(pessoa.getIdade()); // Exibe "15"
    }
}
