package E_OrientacaoObjetos.G_Associacao.Test;

import E_OrientacaoObjetos.G_Associacao.dominio.Escola;
import E_OrientacaoObjetos.G_Associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi sensei");
        Professor professor2 = new Professor("Urahara sensei");

        //Inicializando array com os professores.
        Professor[] professores = {professor1, professor2};

        //Criando a relação entre escola e professores.
        //Uma escola tem um nome e vários professores.
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
