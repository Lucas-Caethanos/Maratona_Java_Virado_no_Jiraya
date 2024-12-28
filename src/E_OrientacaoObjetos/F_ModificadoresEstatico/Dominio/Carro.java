package E_OrientacaoObjetos.F_ModificadoresEstatico.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;

    // Modificador static impede que esse valor se altere por instância específica.
    // O atributo estático pertence à classe, e não a uma instância específica da classe.
    // Isso significa que todos os objetos dessa classe compartilham o mesmo valor para este atributo.
    public static double velocidadeLimite = 250;

    public void imprime() {
        System.out.println("----------------------");
        // Exibe o nome do carro
        System.out.println(this.nome);
        // Exibe a velocidade máxima do carro
        System.out.println(this.velocidadeMax);
        // O atributo estático pode ser acessado diretamente pela classe, sem a necessidade de criar um objeto
        System.out.println(Carro.velocidadeLimite);
    }

    // Construtor da classe que inicializa os atributos nome e velocidade máxima
    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    // Métodos getters e setters para acessar e modificar os atributos nome e velocidade máxima
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
