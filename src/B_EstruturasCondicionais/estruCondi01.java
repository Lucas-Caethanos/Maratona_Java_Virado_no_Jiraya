package B_EstruturasCondicionais;

public class estruCondi01 {
    public static void main(String[] args) {

        int idade = 15;

        // Declaração de uma variável booleana "isAutorizado" que verifica se a idade é maior ou igual a 18.
        boolean isAutorizado = idade >= 18; // A variável será "false" pois 15 não é maior ou igual a 18.

        // Estrutura condicional "if-else" para verificar se a pessoa está autorizada (idade >= 18).
        if(isAutorizado) { // Se isAutorizado for verdadeiro (idade >= 18).
            System.out.println("Dentro do if"); // Executa esse código se a condição for verdadeira.
            System.out.println("Autorizado"); // Mensagem de autorização.

        } else { // Caso contrário, quando a condição for falsa (idade < 18).
            System.out.println("Fora do if"); // Executa esse código se a condição for falsa.
            System.out.println("Não autorizado"); // Mensagem de não autorização.
        }

    }
}
