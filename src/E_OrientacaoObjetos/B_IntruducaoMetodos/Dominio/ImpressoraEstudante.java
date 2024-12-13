package E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio;

public class ImpressoraEstudante {

    // Método para imprimir os atributos de um objeto do tipo EstudanteMetodos.
    public void imprimeestudante(EstudanteMetodos estudanteMetodos){
        // Exibe o nome do estudante.
        System.out.println(estudanteMetodos.nome);

        // Exibe a idade do estudante.
        System.out.println(estudanteMetodos.idade);

        // Exibe o sexo do estudante.
        System.out.println(estudanteMetodos.sexo);
    }
}
