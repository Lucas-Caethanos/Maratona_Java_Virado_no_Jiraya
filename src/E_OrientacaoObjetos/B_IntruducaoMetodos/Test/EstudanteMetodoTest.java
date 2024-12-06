package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.EstudanteMetodos;
import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.ImpressoraEstudante;

public class EstudanteMetodoTest {
    public static void main(String[] args) {
        EstudanteMetodos estudanteMetodos = new EstudanteMetodos();
        EstudanteMetodos estudanteMetodos2 = new EstudanteMetodos();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudanteMetodos.nome = "Ichigo";
        estudanteMetodos.idade = 15;
        estudanteMetodos.sexo = 'M';

        estudanteMetodos2.nome = "Rukia";
        estudanteMetodos2.idade = 150;
        estudanteMetodos2.sexo = 'F';

        //Passando um parâmetro do tipo reference (mandando um objeto como referência)
        impressoraEstudante.imprimeestudante(estudanteMetodos);
        System.out.println("-----------------------");
        impressoraEstudante.imprimeestudante(estudanteMetodos2);

    }
}
