package B_EstruturasCondicionais;

public class estruCondi03 {
    public static void main(String[] args) {

        double salarioD = 200.85;

        // Realiza o casting (conversão explícita) de double para int, truncando a parte decimal.
        int salarioI = (int) salarioD;

        // Operador ternário: verifica se "salarioI" é maior que 300.
        // Se verdadeiro, a variável "resultado" recebe "Doação"; se falso, recebe "Não doação".
        String resultado = (salarioI > 300) ? "Doação" : "Não doação";

        // Exibe o resultado da expressão ternária.
        System.out.println(resultado);
    }
}
