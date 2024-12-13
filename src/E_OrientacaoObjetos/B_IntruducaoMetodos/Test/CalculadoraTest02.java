package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        // Criação de uma instância da classe Calculadora.
        Calculadora calculadora = new Calculadora();

        // Declaração e inicialização de um array de inteiros.
        int[] array = {1, 2, 3, 4, 5};

        // Passa o array como argumento para o método_ somaArray.
        // Este método_ soma todos os elementos do array e imprime o resultado.
        calculadora.somaArray(array);

        // Usando a sintaxe VarArgs:
        // Aqui, não precisamos inicializar explicitamente um array. Os números são passados diretamente como argumentos.
        // Internamente, o VarArgs os trata como um array.
        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
