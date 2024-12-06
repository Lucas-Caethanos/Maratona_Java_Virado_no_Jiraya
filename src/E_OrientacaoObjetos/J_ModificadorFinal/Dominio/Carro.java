package E_OrientacaoObjetos.J_ModificadorFinal.Dominio;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    public static final double VELOCIDADE_LIMITE; //Estamos definindo uma constante. Escrevmos em letras maiúsculas e separamos por '_'

    static {
        //Inicializamos a constante em um bloco de inicialização
        VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
