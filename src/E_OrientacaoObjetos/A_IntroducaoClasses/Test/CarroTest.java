package E_OrientacaoObjetos.A_IntroducaoClasses.Test;

import E_OrientacaoObjetos.A_IntroducaoClasses.Dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Fusca";
        carro01.Modelo = "Legal";
        carro01.ano = 1985;

        System.out.println("O carro " + carro01.nome + " de modelo: " + carro01.Modelo + " e ano " + carro01.ano + " foi comprado");
        System.out.println("-----------------------");

        Carro carro02 = new Carro();
        carro02.nome = "Corsa";
        carro02.Modelo = "Modelo2";
        carro02.ano = 2003;

        System.out.println("O carro " + carro02.nome + " de modelo: " + carro02.Modelo + " e ano " + carro02.ano + " foi comprado");
    }
}
