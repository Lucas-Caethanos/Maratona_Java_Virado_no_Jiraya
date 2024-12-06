package E_OrientacaoObjetos.L_ClassesAbstratas.Dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.1;
    }

    @Override
    public void Imprime() {
        System.out.println("Imprimindo...");
    }
}
