package E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio;

public class EstudanteMetodos {
    // Declaração de variáveis de instância (atributos da classe).
    public String nome; // Nome do estudante.
    public int idade;   // Idade do estudante.
    public char sexo;   // Sexo do estudante ('M', 'F', etc.).

    // Método_ para imprimir os valores dos atributos do objeto.
    // Este método_ não recebe parâmetros porque pode acessar diretamente os atributos da classe (variáveis de instância).
    // O 'this' é usado para se referir às variáveis de instância do objeto atual, garantindo o acesso aos atributos declarados na classe.

    // Método_ que acessa e imprime os atributos do objeto
    public void imprime() {
        System.out.println(this.nome);  // Imprime o nome do estudante.
        System.out.println(this.sexo);  // Imprime o sexo do estudante.
        System.out.println(this.idade); // Imprime a idade do estudante.
    }
}
