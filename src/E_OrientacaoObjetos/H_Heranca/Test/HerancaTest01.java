package E_OrientacaoObjetos.H_Heranca.Test;

import E_OrientacaoObjetos.H_Heranca.Dominio.Endereco;
import E_OrientacaoObjetos.H_Heranca.Dominio.Funcionario;
import E_OrientacaoObjetos.H_Heranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 3");
        endereco.setCep("48484");

        Pessoa pessoa = new Pessoa("Ichigo Kurosaki");

        //pessoa.setNome("Ichigo Kurosaki");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("8889485");

        Funcionario funcionario = new Funcionario("Oda Nobunaga",2000);
        //funcionario.setNome("Oda Nobunaga");
        funcionario.setEndereco(endereco);
        funcionario.setCpf("984415");
        //funcionario.setSalario(2000);

        pessoa.imprime();
        System.out.println("---------------------------------");
        funcionario.imprime();
    }
}
