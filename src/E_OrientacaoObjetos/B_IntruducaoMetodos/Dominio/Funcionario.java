package E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double num : salario) {
            System.out.print(num);
            System.out.print(" | ");
        }

    }

    public void mediaSalario() {
        double media = 0;

        for (double num : salario) {
            media += num;
        }

        media = media / salario.length;

        System.out.println();
        System.out.println(media);
    }
}
