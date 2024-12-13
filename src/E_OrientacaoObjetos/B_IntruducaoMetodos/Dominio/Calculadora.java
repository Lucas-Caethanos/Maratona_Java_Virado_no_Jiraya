package E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio;

public class Calculadora {

    // Método_ para somar dois números fixos (10 + 10) e imprimir o resultado.
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    // Método_ para subtrair dois números fixos (21 - 2) e imprimir o resultado.
    public void tiraDoisNumeros() {
        System.out.println(21 - 2);
    }

    // Introduzindo parâmetros
    // Método_ para multiplicar dois números recebidos como parâmetros e imprimir o resultado.
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    // Método_ com retorno (sem void)
    // Método_ para dividir dois números recebidos como parâmetros e retornar o resultado.
    // Se o divisor (num2) for zero, retorna 0 para evitar divisão por zero.
    public double divideDosNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0; // Tratamento para evitar erro de divisão por zero.
        } else {
            return num1 / num2;
        }
    }

    // Método_ para alterar os valores dos parâmetros (número1 e número2) para valores fixos e imprimir esses novos valores. As alterações não afetam os valores originais dos argumentos passados (pois são tipos primitivos, e a alteração é feita em cópias locais).
    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 56;
        numero2 = 52;

        System.out.println(numero1);
        System.out.println(numero2);
    }

    // Método_ para somar os elementos de um array de inteiros recebido como parâmetro e imprimir o resultado.
    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) { // Itera sobre o array utilizando um laço for-each.
            soma += num;
        }

        System.out.println(soma);
    }

    // Método_ para somar múltiplos números passados como parâmetros variáveis (varargs).
    // Internamente, o Java trata os varargs como um array, permitindo manipulação similar.
    public void somaVarArgs(int... numeros) {
        int soma = 0;

        for (int num : numeros) { // Itera sobre os números passados nos varargs.
            soma += num;
        }

        System.out.println(soma);
    }
}
