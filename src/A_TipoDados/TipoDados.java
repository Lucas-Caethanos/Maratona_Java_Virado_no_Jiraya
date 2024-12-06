package A_TipoDados;

public class TipoDados {
    public static void main(String[] args) {

        // Tipos inteiros
        int age = 10; // Variável inteira simples.
        int age2 = (int) 1000000000L; // Conversão explícita (casting) de um valor do tipo long para int.

        // Tipos numéricos de ponto flutuante
        double salarioDouble = 2000.45D; // Número decimal de precisão dupla. O sufixo "D" é opcional.
        float salarioFloat = 2500.45F; // Número decimal de precisão simples. O sufixo "F" é obrigatório para floats.

        // Tipos inteiros menores
        byte idadeyte = 10; // Um número inteiro pequeno (8 bits).
        short idadeShort = 10; // Um número inteiro maior que byte, mas menor que int (16 bits).

        // Tipos booleanos
        boolean verdadeiro = true; // Armazena um valor lógico verdadeiro.
        boolean falso = false; // Armazena um valor lógico falso.

        // Tipo caractere
        char caracter = 'A'; // Representa um único caractere. Pode usar Unicode ou valores ASCII.

        // Tipo por referência
        String nome = "Isso é uma String hehe"; // String é um objeto para armazenar texto.
        var nome2 = "O \"var\" foi adicionado no Java 10"; // Uso de "var" (adicionado no Java 10) para inferir o tipo automaticamente.

    }
}

