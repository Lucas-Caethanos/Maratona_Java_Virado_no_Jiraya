package E_OrientacaoObjetos.N_Polimorfismo.Dominio;

// Interface que define o contrato para cálculo de imposto.
// Qualquer classe que implementar esta interface deverá fornecer uma implementação para o método_ calcularImposto().
public interface Taxavel {

    // Método_ abstrato que calcula o imposto.
    // Por padrão, métodos em interfaces são públicos e abstratos.
    double calcularImposto();

}
