package E_OrientacaoObjetos.L_ClassesAbstratas.Test;

import E_OrientacaoObjetos.L_ClassesAbstratas.Dominio.Desenvolvedor;
import E_OrientacaoObjetos.L_ClassesAbstratas.Dominio.Funcionario;
import E_OrientacaoObjetos.L_ClassesAbstratas.Dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        // Criação de um objeto Gerente e um objeto Desenvolvedor
        Gerente gerente01 = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Lufy", 12000);

        // Imprimindo os detalhes dos objetos
        System.out.println(gerente01);
        System.out.println(desenvolvedor01);

        // Chamando o método_ Imprime para cada objeto
        gerente01.Imprime();
        desenvolvedor01.Imprime();
    }
}
