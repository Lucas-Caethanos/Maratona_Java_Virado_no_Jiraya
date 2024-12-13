package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.EstudanteMetodos;
import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteMetodoTest01 {
    public static void main(String[] args) {
        // Criação de dois objetos da classe EstudanteMetodos.
        EstudanteMetodos estudante01 = new EstudanteMetodos();
        EstudanteMetodos estudante02 = new EstudanteMetodos();

        // Criação de um objeto da classe ImpressoraEstudante.
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        // Inicialização dos atributos do primeiro estudante.
        estudante01.nome = "Ichigo";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        // Inicialização dos atributos do segundo estudante.
        estudante02.nome = "Rukia";
        estudante02.idade = 150;
        estudante02.sexo = 'F';

        // Imprime os atributos do primeiro estudante usando o método_ imprimeEstudante da classe ImpressoraEstudante.
        // O método_ recebe o objeto 'estudante01' como parâmetro e acessa os seus atributos.
        impressoraEstudante.imprimeestudante(estudante01);

        System.out.println("-----------------------");

        // Imprime os atributos do segundo estudante de forma similar, passando o objeto 'estudante02'.
        impressoraEstudante.imprimeestudante(estudante02);
    }
}
