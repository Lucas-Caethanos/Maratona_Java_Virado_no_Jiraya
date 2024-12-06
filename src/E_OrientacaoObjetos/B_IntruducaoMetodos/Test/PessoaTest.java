package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //pessoa.nome = "Ichigo";
        //pessoa.idade = 15;

        //Utlizando um método de acesso atribuir um valor (set)
        pessoa.setNome("Ichigo");
        pessoa.setIdade(15);

        //Acoplamento tem haver com o quanbto uma classe sabe da outra
        pessoa.imprime();
        System.out.println("------------------------------");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }



}
