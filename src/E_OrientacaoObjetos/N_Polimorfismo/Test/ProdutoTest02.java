package E_OrientacaoObjetos.N_Polimorfismo.Test;

import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Computador;
import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Produto;
import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Televisao;
import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Tomate;
import E_OrientacaoObjetos.N_Polimorfismo.Servico.CalculadoraImposto;

// Classe de teste para verificar o cálculo de imposto utilizando polimorfismo.
public class ProdutoTest02 {
    public static void main(String[] args) {
        // Criação de objetos do tipo Produto usando polimorfismo.
        Produto produto01 = new Computador("Ryzen 9", 3000);
        Produto produto02 = new Tomate("Tomate Verde", 3);
        Produto produto03 = new Televisao("Samsung 50\"", 1500);

        // Cálculo e exibição do imposto para o Computador.
        CalculadoraImposto.calcularImposto(produto01);
        System.out.println();

        // Cálculo e exibição do imposto para o Tomate.
        CalculadoraImposto.calcularImposto(produto02);
        System.out.println();

        // Cálculo e exibição do imposto para a Televisão.
        CalculadoraImposto.calcularImposto(produto03);
    }
}
