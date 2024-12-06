package E_OrientacaoObjetos.F_ModificadoresEstatico.Test;

import E_OrientacaoObjetos.F_ModificadoresEstatico.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BMW",280);
        Carro carro02 = new Carro("Mercedes",275);
        Carro carro03 = new Carro("Audi",290);


        //Estamos alterando todas as instâncias dos objetos
        //carro01.setVelocidadelimite(160);

        //Alterando o valor através do nome da classes
        Carro.velocidadelimite = 180;
        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
