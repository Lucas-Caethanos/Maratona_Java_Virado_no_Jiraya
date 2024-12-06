package E_OrientacaoObjetos.L_ClassesAbstratas.Dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    //O toString também foi herdado pelas subclasses.
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

//    public void calculaBonus(){
//        this.salario = salario + salario * 0.1;
//    }

    //Forçando todas as subclasses a sobrescreverem o método calculaBonus
    public abstract void calculaBonus();
}
