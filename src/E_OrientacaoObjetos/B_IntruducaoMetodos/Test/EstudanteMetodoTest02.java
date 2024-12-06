package E_OrientacaoObjetos.B_IntruducaoMetodos.Test;

import E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio.EstudanteMetodos;

public class EstudanteMetodoTest02 {
    public static void main(String[] args) {
        EstudanteMetodos estudanteMetodos01 = new EstudanteMetodos();

        estudanteMetodos01.nome = "Ichigo";
        estudanteMetodos01.idade = 15;
        estudanteMetodos01.sexo = 'M';

        estudanteMetodos01.imprime();

    }
}
