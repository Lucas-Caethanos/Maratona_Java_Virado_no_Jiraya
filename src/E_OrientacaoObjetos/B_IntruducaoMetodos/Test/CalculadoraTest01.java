package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        // Cria uma instância da classe Calculadora.
        Calculadora calculadora = new Calculadora();

        // Chama o método_ somaDoisNumeros, que realiza a soma de 10 + 10 e imprime o resultado.
        calculadora.somaDoisNumeros();

        // Chama o método_ tiraDoisNumeros, que realiza a subtração de 21 - 2 e imprime o resultado.
        calculadora.tiraDoisNumeros();

        // Chama o método_ multiplicaDoisNumeros com os parâmetros 10 e 20, imprimindo o resultado da multiplicação.
        calculadora.multiplicaDoisNumeros(10, 20);

        System.out.println("--------------------");

        // Chama o método_ divideDosNumeros com os valores 20 e 2, armazena o resultado numa variável e imprime o valor retornado (10.0).
        double resultado = calculadora.divideDosNumeros(20, 2);
        System.out.println(resultado);

        System.out.println("--------------------");

        // Chama o método_ divideDosNumeros com os valores 20 e 0, onde o divisor é zero.
        // O método_ retorna 0, tratado como um caso especial para evitar erro de divisão por zero.
        System.out.println(calculadora.divideDosNumeros(20, 0));

        System.out.println("--------------------");

        // Declaração de duas variáveis inteiras 'x' e 'y' com valores 2 e 3.
        int x = 2;
        int y = 3;

        // Imprime os valores de 'x' e 'y' antes de serem passados para o método_ alteraDoisNumeros.
        System.out.println("Fora do método");

        System.out.println(x);
        System.out.println(y);

        System.out.println("dentro do método");

        // Chama o método_ alteraDoisNumeros, passando 'x' e 'y' como argumentos.
        // Como os valores são do tipo primitivo, apenas cópias dos valores são passadas para o método_.
        // Dentro do método_, os valores são alterados, mas isso não afeta as variáveis originais 'x' e 'y'.
        calculadora.alteraDoisNumeros(x, y);

        // Note que os valores de 'x' e 'y' fora do método_ permanecem inalterados, pois o Java trabalha com cópias de valores para tipos primitivos ao invés de referências.
    }
}
