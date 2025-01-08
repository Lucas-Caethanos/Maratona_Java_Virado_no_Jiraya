package E_OrientacaoObjetos.G_Associacao.Test;

import E_OrientacaoObjetos.G_Associacao.Dominio.Escola;
import E_OrientacaoObjetos.G_Associacao.Dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        // Criando instâncias da classe Professor com os seus nomes
        Professor professor1 = new Professor("Kakashi sensei");
        Professor professor2 = new Professor("Urahara sensei");

        // Inicializando um array para armazenar os professores
        Professor[] professores = {professor1, professor2};

        // Criando a instância da classe Escola, associando um nome à escola e o array de professores
        Escola escola = new Escola("Konoha", professores);

        // Chamando o método imprime da classe Escola para exibir os dados
        escola.imprime();
    }
}
