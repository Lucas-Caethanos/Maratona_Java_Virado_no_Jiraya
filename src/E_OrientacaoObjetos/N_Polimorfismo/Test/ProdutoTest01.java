package E_OrientacaoObjetos.N_Polimorfismo.Test;

import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Computador;
import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Tomate;
import E_OrientacaoObjetos.N_Polimorfismo.Servico.CalculadoraImposto;

// Classe de teste para verificar o funcionamento do cálculo de imposto para diferentes produtos.
public class ProdutoTest01 {
    public static void main(String[] args) {

        // Criação de objetos Computador com valores e nomes específicos.
        Computador computador01 = new Computador("NUC10i7", 11000.00);
        Computador computador02 = new Computador("Deep Blue", 300000.00);

        // Criação de objetos Tomate com valores e nomes específicos.
        Tomate tomate01 = new Tomate("Tomate Verde", 3.00);
        Tomate tomate02 = new Tomate("Tomate Vermelho", 5.00);

        // Cálculo e exibição do imposto para os objetos do tipo Computador.
        CalculadoraImposto.calcularImpostoComputador(computador01);
        System.out.println(); // Separador para melhorar a legibilidade do console.
        CalculadoraImposto.calcularImpostoComputador(computador02);

        System.out.println("-----------------------"); // Separador entre os produtos.

        // Cálculo e exibição do imposto para os objetos do tipo Tomate.
        CalculadoraImposto.calcularImpostoTomate(tomate01);
        System.out.println(); // Separador para melhorar a legibilidade do console.
        CalculadoraImposto.calcularImpostoTomate(tomate02);

    }
}
