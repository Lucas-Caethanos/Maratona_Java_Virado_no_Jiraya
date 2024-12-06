package E_OrientacaoObjetos.G_Associacao.ExrcicioAssociacao.Test;

import E_OrientacaoObjetos.G_Associacao.ExrcicioAssociacao.Dominio.Estudantes;
import E_OrientacaoObjetos.G_Associacao.ExrcicioAssociacao.Dominio.Local;
import E_OrientacaoObjetos.G_Associacao.ExrcicioAssociacao.Dominio.Professores;
import E_OrientacaoObjetos.G_Associacao.ExrcicioAssociacao.Dominio.Seminarios;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local1 = new Local("Soul Society");
        Local local2 = new Local("Hueco Mundo");

        Estudantes estudante1 = new Estudantes("Ichigo", 15);
        Estudantes estudante2 = new Estudantes("Renji", 150);
        Estudantes estudante3 = new Estudantes("Rukia", 150);
        Estudantes estudante4 = new Estudantes("Momo", 130);
        Estudantes estudante5 = new Estudantes("Uryu", 15);
        Estudantes estudante6 = new Estudantes("Orihime", 15);

        Estudantes[] turma1 = {estudante1, estudante4, estudante2};
        Estudantes[] turma2 = {estudante5, estudante2, estudante6};
        Estudantes[] turma3 = {estudante3, estudante2, estudante6, estudante5};

        Seminarios seminario1 = new Seminarios("Hoho", turma1, local1);
        Seminarios seminario2 = new Seminarios("Zanjutsu", turma2, local2);
        Seminarios seminario3 = new Seminarios("Kido", turma3, local1);

        estudante1.setSeminario(seminario1);
        estudante6.setSeminario(seminario2);
        estudante2.setSeminario(seminario3);
        estudante4.setSeminario(seminario1);
        estudante5.setSeminario(seminario1);

        Seminarios[] Aula1 = {seminario1, seminario2};
        Seminarios[] Aula2 = {seminario2};
        Seminarios[] Aula3 = {seminario3, seminario2, seminario1};
        Seminarios[] Aula4 = {seminario1};

        Professores professor1 = new Professores("Byakuya","Shinigami", Aula1);
        Professores professor2 = new Professores("Jugram","Quincy", Aula2);
        Professores professor3 = new Professores("Yamamoto","Shinigami",Aula2);
        Professores professor4 = new Professores("Ulquiorra","Arrancar", Aula2);
        Professores professor5 = new Professores("Aizen","Deus",Aula4);


       estudante1.imprimeAluno();

        System.out.println("------------------");

        seminario1.imprimeSeminario();

        System.out.println("------------------");

        professor1.imprimeProfessor();

    }
}
