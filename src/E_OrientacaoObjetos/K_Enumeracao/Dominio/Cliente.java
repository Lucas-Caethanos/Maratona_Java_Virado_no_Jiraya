package E_OrientacaoObjetos.K_Enumeracao.Dominio;

public class Cliente {

    private String nome;
    private String tipo;
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    public Cliente(String nome, String tipo) {

        if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){

            this.nome = nome;
            this.tipo = "Vazio";

        }else{
            this.nome = nome;
            this.tipo = tipo;

        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
