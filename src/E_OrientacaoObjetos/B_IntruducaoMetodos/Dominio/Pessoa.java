package E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio;

public class Pessoa {
    // Atributos privados (encapsulamento)
    private String nome; // Atributo privado para o nome da pessoa
    private int idade;   // Atributo privado para a idade da pessoa

    // Método_ para imprimir os valores dos atributos
    public void imprime(){
        System.out.println(this.nome); // Imprime o nome da pessoa
        System.out.println(this.idade); // Imprime a idade da pessoa
    }

    // Setter para o atributo 'nome'. Permite que o nome seja modificado.
    public void setNome(String nome){
        this.nome = nome; // Atribui o valor recebido ao atributo 'nome' da classe
    }

    // Setter para o atributo 'idade'. Permite que a idade seja modificada.
    public void setIdade(int idade){
        // Verifica se a idade fornecida é válida
        if (idade <= 0){
            System.out.println("Idade inválida"); // Se a idade for menor ou igual a 0, exibe uma mensagem de erro
        } else {
            this.idade = idade; // Caso contrário, atribui o valor recebido ao atributo 'idade'
        }
    }

    // Getter para o atributo 'nome'. Permite que o nome seja acessado.
    public String getNome(){
        return this.nome; // Retorna o valor do atributo 'nome'
    }

    // Getter para o atributo 'idade'. Permite que a idade seja acessada.
    public int getIdade(){
        return this.idade; // Retorna o valor do atributo 'idade'
    }
}
