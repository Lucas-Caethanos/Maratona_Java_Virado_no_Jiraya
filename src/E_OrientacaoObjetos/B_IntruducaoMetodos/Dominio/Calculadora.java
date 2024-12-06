package E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio;

public class Calculadora {

    //Modificador de acesso + retorno + nomeDoMetodo
    public void somaDoisNumeros() { //Método sem retorno (void)
        System.out.println(10 + 10);
    }

    public void tiraDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { //Introduzindo parâmetros
        System.out.println(num1 * num2);
    }

    public double divideDosNumeros(double num1, double num2) { //Método com retorno (sem void)

        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 56;
        numero2 = 52;

        System.out.println(numero1);
        System.out.println(numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);

    }

    //Transforma os parâmetros (lista de números) em um array
    public void somaVarArgs(int... numeros){
        int soma = 0;

        for(int num : numeros){
            soma += num;
        }

        System.out.println(soma);

    }
}
