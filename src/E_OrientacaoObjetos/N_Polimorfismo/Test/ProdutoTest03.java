package E_OrientacaoObjetos.N_Polimorfismo.Test;

import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Computador;
import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Produto;
import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Tomate;
import E_OrientacaoObjetos.N_Polimorfismo.Servico.CalculadoraImposto;

// Classe de teste para verificar o cálculo de imposto utilizando polimorfismo.
public class ProdutoTest03 {
    public static void main(String[] args) {
        // Criação de um objeto do tipo Produto representando um Computador.
        Produto computador = new Computador("Ryzen 9", 3000);

        // Criação de um objeto Tomate com definição de data de validade.
        Tomate tomate = new Tomate("Tomate Verde", 3);
        tomate.setDataValidade("12/12");

        // Cálculo e exibição do imposto para o Tomate.
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println();

        // Cálculo e exibição do imposto para o Computador.
        CalculadoraImposto.calcularImposto(computador);
    }
}
