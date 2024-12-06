package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.Funcionario;

public class FuncionariosTest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Ichigo";
        funcionario01.idade = 15;
        //Criamos um objeto array, pois array é uma referência
        funcionario01.salario = new double[]{40.52, 40.52, 40.52};


        System.out.println("--------------------");
        funcionario01.imprime();
        funcionario01.mediaSalario();

    }
}
