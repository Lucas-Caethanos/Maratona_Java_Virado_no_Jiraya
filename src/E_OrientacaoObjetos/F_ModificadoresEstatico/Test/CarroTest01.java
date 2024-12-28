package E_OrientacaoObjetos.F_ModificadoresEstatico.Test;

import E_OrientacaoObjetos.F_ModificadoresEstatico.Dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        // Criando três instâncias de objetos da classe Carro com diferentes nomes e velocidades máximas
        Carro carro01 = new Carro("BMW", 280);
        Carro carro02 = new Carro("Mercedes", 275);
        Carro carro03 = new Carro("Audi", 290);

        // Comentado: Caso tentássemos alterar o valor de "velocidadeLimite" para 160, isso afetaria todas as instâncias do objeto, já que "velocidadeLimite" é um atributo estático.
        // carro01.setVelocidadeLimite(160);

        // Alterando o valor do atributo estático "velocidadeLimite" diretamente pela classe Carro.
        // Isso faz com que todos os objetos da classe Carro compartilhem o novo valor (180).
        Carro.velocidadeLimite = 180;

        // Imprimindo os atributos de cada carro. O valor de "velocidadeLimite" será o mesmo para todos os carros por ser um atributo estático.
        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
