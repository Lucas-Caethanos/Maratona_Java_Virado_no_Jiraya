package E_OrientacaoObjetos.J_ModificadorFinal.Test;

import E_OrientacaoObjetos.J_ModificadorFinal.Dominio.Comprador;
import E_OrientacaoObjetos.J_ModificadorFinal.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
       Carro carro = new Carro();

        Comprador comprador2 = new Comprador();
        carro.COMPRADOR.setNome("Ichigo");
        System.out.println(carro.COMPRADOR);

        System.out.println(Carro.VELOCIDADE_LIMITE);

    }
}
