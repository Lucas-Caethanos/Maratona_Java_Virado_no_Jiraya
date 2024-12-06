package E_OrientacaoObjetos.F_ModificadoresEstatico.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;

    //Modificador static impede que esse valor se altere
    //O modificador static faz o atributo pertencer a classe, e não somente ao objeto
    //Todos os objetos vão compartilar o mesmo valor
    public static double velocidadelimite = 250;

    public void imprime(){
        System.out.println("----------------------");
        System.out.println(this.nome);
        System.out.println(this.velocidadeMax);
        //System.out.println(this.velocidadelimite);

        //Passando referência do nome da classe
        System.out.println(Carro.velocidadelimite);
    }

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
