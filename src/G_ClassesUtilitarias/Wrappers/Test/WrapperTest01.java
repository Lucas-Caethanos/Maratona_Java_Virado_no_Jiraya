package G_ClassesUtilitarias.Wrappers.Test;

import java.util.List;

public class WrapperTest01 {
    public static void main(String[] args) {

        // Tipos primitivos (armazenam valores diretamente)
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        // Wrappers (classes que encapsulam os tipos primitivos)
        // Os wrappers permitem que os tipos primitivos sejam tratados como objetos
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        // Exemplo de erro: não podemos criar listas de tipos primitivos diretamente
//        List<int> list;

        // Usamos wrappers para contornar essa limitação
        List<Integer> list;

        // Unboxing: Pegamos o valor do wrapper (Integer) e atribuímos a uma variável primitiva
        int i = intW; // O compilador faz automaticamente a conversão (unboxing)

        // Convertendo uma String em Integer com parseInt
        Integer intW2 = Integer.parseInt("1"); // Retorna 1 como Integer

        // Este construtor está obsoleto desde o Java 9 (não recomendado)
//        Integer intw3 = new Integer("2");

        // Boolean.parseBoolean ignora maiúsculas/minúsculas, e só retorna 'true' se a String for exatamente "true"
        boolean verdadeiro = Boolean.parseBoolean("TruE"); // Retorna true

        // Métodos utilitários da classe Character

        System.out.println(Character.isDigit('A'));       // false (não é um número)
        System.out.println(Character.isDigit('9'));       // true  (é um número)
        System.out.println(Character.isLetter('n'));      // true  (é uma letra)
        System.out.println(Character.isUpperCase('n'));   // false (não é maiúscula)
        System.out.println(Character.isLowerCase('n'));   // true  (é minúscula)
        System.out.println(Character.toUpperCase('n'));   // 'N'   (converte para maiúscula)
        System.out.println(Character.toLowerCase('N'));   // 'n'   (converte para minúscula)
    }
}
