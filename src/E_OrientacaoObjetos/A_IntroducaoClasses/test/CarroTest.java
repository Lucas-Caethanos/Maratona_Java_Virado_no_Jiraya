package E_OrientacaoObjetos.A_IntroducaoClasses.test;

// A classe Carro será usada para criar objetos no código.
import E_OrientacaoObjetos.A_IntroducaoClasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {

        // Criando o primeiro objeto 'carro01' do tipo Carro.
        Carro carro01 = new Carro();

        // Atribuindo valores aos atributos do objeto 'carro01'.
        // O nome do carro é "Fusca", o modelo é "Legal" e o ano de fabricação é 1985.
        carro01.nome = "Fusca";
        carro01.modelo = "Legal";
        carro01.ano = 1985;

        // Criando o segundo objeto 'carro02' do tipo Carro.
        Carro carro02 = new Carro();

        // Atribuindo valores aos atributos do objeto 'carro02'.
        // O nome do carro é "Corsa", o modelo é "Modelo2" e o ano de fabricação é 2003.
        carro02.nome = "Corsa";
        carro02.modelo = "Modelo2";  // Corrigido para 'modelo'
        carro02.ano = 2003;

        System.out.println("O carro " + carro01.nome + " de modelo: " + carro01.modelo + " e ano " + carro01.ano + " foi comprado");

        System.out.println("-----------------------");

        System.out.println("O carro " + carro02.nome + " de modelo: " + carro02.modelo + " e ano " + carro02.ano + " foi comprado");
    }
}
