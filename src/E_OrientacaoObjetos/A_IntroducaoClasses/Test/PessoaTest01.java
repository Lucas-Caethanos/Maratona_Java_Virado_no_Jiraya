package E_OrientacaoObjetos.A_IntroducaoClasses.Test;

import E_OrientacaoObjetos.A_IntroducaoClasses.Dominio.Estudante;

public class PessoaTest01 {
    public static void main(String[] args) {
        //Variável de referência do tipo estudante é usada para criar um objeto.

        //Estudante = variável de referência.
        //estudante01 = nome do objeto.
        //new Estudante() = criação do objeto do tipo estudante.

        Estudante estudante01 = new Estudante();

        estudante01.nome = "Lucas";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);



    }
}
