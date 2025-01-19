package E_OrientacaoObjetos.N_Polimorfismo.Servico;

import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Computador;
import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Produto;
import E_OrientacaoObjetos.N_Polimorfismo.Dominio.Tomate;

// Classe responsável pelo cálculo e exibição de impostos para diferentes tipos de produtos.
public class CalculadoraImposto {

    // Método_ específico para calcular e exibir o imposto de um Computador.
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador");

        // Calcula o imposto usando o método_ calcularImposto() do objeto Computador.
        double imposto = computador.calcularImposto();

        // Exibe as informações do Computador e o imposto calculado.
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    // Método_ específico para calcular e exibir o imposto de um Tomate.
    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do tomate");

        // Calcula o imposto usando o método_ calcularImposto() do objeto Tomate.
        double imposto = tomate.calcularImposto();

        // Exibe as informações do Tomate e o imposto calculado.
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    // Método_ genérico para calcular e exibir o imposto de qualquer Produto.
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");

        // Calcula o imposto usando o método_ calcularImposto() do objeto Produto.
        double imposto = produto.calcularImposto();

        // Exibe as informações do Produto e o imposto calculado.
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        // Verifica se o produto é uma instância de Tomate para exibir informações adicionais.
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }
}
