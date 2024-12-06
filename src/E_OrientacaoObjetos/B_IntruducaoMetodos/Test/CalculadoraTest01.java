package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(); //Chamando o método
        calculadora.tiraDoisNumeros();
        calculadora.multiplicaDoisNumeros(10,20);

        System.out.println("--------------------");
        double resultado = calculadora.divideDosNumeros(20,2); //Atribuindo o retorno do método a uma variável
        System.out.println(resultado);

        System.out.println("--------------------");
        System.out.println(calculadora.divideDosNumeros(20,0)); //Impriindo diretamente o retorno do método

        System.out.println("--------------------");
        int x = 2;
        int y = 3;

        System.out.println("Fora do método");
        System.out.println(x);
        System.out.println(y);

        System.out.println("dentro do método");
        //Quando passamos uma variável de tipo primitivo, enviamos apenas uma cópia (não a referência).
        // O original (referência) permanece inalterado.
        calculadora.alteraDoisNumeros(x, y);




    }
}
