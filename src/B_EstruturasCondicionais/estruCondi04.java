package B_EstruturasCondicionais;

public class estruCondi04 {
    public static void main(String[] args) {

        int day = 34564;
        int semana;

        // Se o valor de "day" for maior que 30, ele é dividido por 30 e atribui o restante à variável "day".
        if (day > 30){
            day = day % 30; // Aqui, o número de dias é reduzido para um valor entre 0 e 29.
        }

        // Condicional que determina em qual semana do mês a data cai, com base no valor de "day".
        if (day >= 1 && day < 7) { // Se "day" está entre 1 e 6, então é a primeira semana.
            semana = 0;
            day = day - (7 * semana); // Ajuste do valor de "day" para o número correspondente ao dia da semana.

        } else if (day >= 7 && day < 14) { // Se "day" está entre 7 e 13, então é a segunda semana.
            semana = 1;
            day = day - (7 * semana); // Ajuste para a segunda semana.

        } else if (day >= 14 && day < 21) { // Se "day" está entre 14 e 20, então é a terceira semana.
            semana = 2;
            day = day - (7 * semana); // Ajuste para a terceira semana.

        } else if (day >= 21 && day < 28) { // Se "day" está entre 21 e 27, então é a quarta semana.
            semana = 3;
            day = day - (7 * semana); // Ajuste para a quarta semana.

        } else { // Se "day" está entre 28 e 30, então é a quinta semana.
            semana = 4;
            day = - (7 * semana); // Aqui, "day" é ajustado para um valor negativo, mas isso não afeta o resultado final.
        }

        // Estrutura switch para determinar o nome do dia da semana com base no valor de "day".
        switch (day) {
            case 1:
                System.out.println("Domingo"); // Se "day" for 1, imprime "Domingo".
                break;
            case 2:
                System.out.println("Segunda-feira"); // Se "day" for 2, imprime "Segunda-feira".
                break;
            case 3:
                System.out.println("Terça-feira"); // Se "day" for 3, imprime "Terça-feira".
                break;
            case 4:
                System.out.println("Quarta-feira"); // Se "day" for 4, imprime "Quarta-feira".
                break;
            case 5:
                System.out.println("Quinta-feira"); // Se "day" for 5, imprime "Quinta-feira".
                break;
            case 6:
                System.out.println("Sexta-feira"); // Se "day" for 6, imprime "Sexta-feira".
                break;
            case 7:
                System.out.println("Sabado"); // Se "day" for 7, imprime "Sabado".
                break;
            default:
                System.out.println("Opção inválida"); // Caso o valor de "day" não seja de 1 a 7, imprime mensagem de erro.
                break;
        }

    }
}
