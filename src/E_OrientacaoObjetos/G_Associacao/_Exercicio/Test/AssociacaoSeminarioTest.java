package E_OrientacaoObjetos.G_Associacao._Exercicio.Test;

import E_OrientacaoObjetos.G_Associacao._Exercicio.Dominio.Estudante;
import E_OrientacaoObjetos.G_Associacao._Exercicio.Dominio.Local;
import E_OrientacaoObjetos.G_Associacao._Exercicio.Dominio.Professor;
import E_OrientacaoObjetos.G_Associacao._Exercicio.Dominio.Seminario;

public class AssociacaoSeminarioTest {

    public static void main(String[] args) {

        // Criando Locais
        Local local01 = new Local("Soul Society");
        Local local02 = new Local("Hueco Mundo");
        Local local03 = new Local("Mundo Humano");
        Local local04 = new Local("Lichtreich");

        // Criando Estudantes
        Estudante estudante01 = new Estudante("Ichigo", 15);
        Estudante estudante02 = new Estudante("Renji", 150);
        Estudante estudante03 = new Estudante("Rukia", 150);
        Estudante estudante04 = new Estudante("Ulquiorra", 500);
        Estudante estudante05 = new Estudante("Orihime", 16);
        Estudante estudante06 = new Estudante("Uryu", 17);

        // Criando Professores
        Professor professor01 = new Professor("Urahara", "Shinigami");
        Professor professor02 = new Professor("Stark", "Arrancar");
        Professor professor03 = new Professor("Ishida Ryuken", "Quincy");
        Professor professor04 = new Professor("Yoruichi", "Shinigami");
        Professor professor05 = new Professor("Tsukishima", "Fullbringer");

        // Criando Array de estudantes
        Estudante[] estudanteShinigami = {estudante01, estudante02, estudante03};
        Estudante[] estudanteFullbringer = {estudante01, estudante05};
        Estudante[] estudanteHollow = {estudante01, estudante04};
        Estudante[] estudanteQuincy = {estudante01, estudante06};

        // Criando Seminários
        Seminario seminario01 = new Seminario("Kido", estudanteShinigami, local01);
        Seminario seminario02 = new Seminario("Hakuda", estudanteShinigami, local01);
        Seminario seminario03 = new Seminario("Kenjutsu", estudanteShinigami, local01);
        Seminario seminario04 = new Seminario("Cero", estudanteHollow, local02);
        Seminario seminario05 = new Seminario("Fullbring", estudanteFullbringer, local03);
        Seminario seminario06 = new Seminario("Manipulação de Reishi", estudanteQuincy, local04);

        Seminario[] seminarioShinigami = {seminario01, seminario02, seminario03};
        Seminario[] seminarioFullbringer = {seminario05};
        Seminario[] seminarioHollow = {seminario04};
        Seminario[] seminarioQuincy = {seminario06};

        professor01.setSeminarios(seminarioShinigami);
        professor02.setSeminarios(seminarioHollow);
        professor03.setSeminarios(seminarioQuincy);
//        professor04.setSeminarios(seminarioShinigami);
        professor05.setSeminarios(seminarioFullbringer);

        Professor[] professores = {professor01, professor02, professor03, professor04, professor05};

        for (Professor professor : professores) {
            professor.imprime();
        }


    }

}
