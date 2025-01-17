package E_OrientacaoObjetos.J_ModificadorFinal.Test;

// Importa as classes necessárias para o teste.
import E_OrientacaoObjetos.J_ModificadorFinal.Dominio.Comprador;
import E_OrientacaoObjetos.J_ModificadorFinal.Dominio.Carro;

// Classe de teste para a classe Carro.
public class CarroTest01 {
    public static void main(String[] args) {
        // Cria um objeto da classe Carro.
        Carro carro = new Carro();

        // Cria um objeto da classe Comprador.
        Comprador comprador2 = new Comprador();

        // Define o nome do comprador associado ao carro.
        // Apesar de 'COMPRADOR' ser um atributo 'final', é possível alterar os atributos do objeto.
        carro.COMPRADOR.setNome("Ichigo");

        // Imprime as informações do comprador associado ao carro.
        // O método toString() da classe Comprador será chamado automaticamente.
        System.out.println(carro.COMPRADOR);

        // Imprime o valor da constante estática VELOCIDADE_LIMITE.
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
