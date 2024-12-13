package E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio;

public class Funcionario {
    public String nome;       // Atributo para armazenar o nome do funcionário
    public int idade;         // Atributo para armazenar a idade do funcionário
    public double[] salario;  // Atributo para armazenar um array de salários

    // Método_ para imprimir os atributos do funcionário
    public void imprime() {
        System.out.println(this.nome);  // Exibe o nome do funcionário
        System.out.println(this.idade); // Exibe a idade do funcionário

        // Itera sobre o array de salários e imprime cada valor
        for (double num : this.salario) {
            System.out.print(num);
            System.out.print(" | ");    // Adiciona um separador para os valores exibidos
        }
    }

    // Método_ para calcular e imprimir a média dos salários
    public void mediaSalario() {
        double media = 0;

        // Soma todos os salários no array
        for (double num : this.salario) {
            media += num;
        }

        // Calcula a média dividindo a soma pelo número de elementos no array
        media = media / this.salario.length;

        System.out.println();                  // Adiciona uma quebra de linha antes da média
        System.out.printf("R$ %.2f%n", media); // Exibe a média dos salários
    }
}
