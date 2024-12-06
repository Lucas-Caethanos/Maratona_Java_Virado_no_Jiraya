package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] array = {1,2,3,4,5};

        //Passando um array já inicializado:
        calculadora.somaArray(array);

        //Usando a sintaxe VarArgs:
        //Passamos os parâmetros sem incializar um array.
        //Caso tenha mais de um tipo de atributo, o VarArg deve ser o último a se passado.
        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
