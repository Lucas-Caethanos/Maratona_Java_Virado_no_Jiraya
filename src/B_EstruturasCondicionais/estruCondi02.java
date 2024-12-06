package B_EstruturasCondicionais;

public class estruCondi02 {
    public static void main(String[] args) {

        int idade = 45;

        // Verifica se a idade é maior ou igual a 0, para garantir que o valor da idade seja válido.
        if (idade >= 0) { // Se a idade for válida (>= 0).

            // Estrutura condicional aninhada para verificar as faixas etárias.
            if (idade < 15) { // Se a idade for menor que 15, categoria infantil.
                System.out.println("Categoria infantil");

            } else if (idade >= 15 && idade <= 18) { // Se a idade for entre 15 e 18, categoria juvenil.
                System.out.println("Categoria juvenil");

            } else { // Caso contrário, se a idade for maior que 18, categoria adulta.
                System.out.println("Categoria adulta");
            }

        } else { // Se a idade for negativa (inválida).
            System.out.println("Número inválido"); // Exibe mensagem de erro.
        }

    }
}
