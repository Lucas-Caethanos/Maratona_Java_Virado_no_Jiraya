package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.EstudanteMetodos;

public class EstudanteMetodoTest02 {
    public static void main(String[] args) {
        // Criação de uma instância da classe EstudanteMetodos
        EstudanteMetodos estudante01 = new EstudanteMetodos();

        // Inicialização dos atributos do objeto
        estudante01.nome = "Ichigo";  // Atribuindo "Ichigo" ao atributo nome
        estudante01.idade = 15;       // Atribuindo 15 ao atributo idade
        estudante01.sexo = 'M';       // Atribuindo 'M' ao atributo sexo

        // Chamando o método_ imprime() para exibir os valores dos atributos
        estudante01.imprime();
    }
}
