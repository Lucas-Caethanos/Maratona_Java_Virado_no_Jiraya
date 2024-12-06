package E_OrientacaoObjetos.J_ModificadorFinal.Dominio;

public class Comprador {
    private String Nome;

    @Override
    public String toString() {
        return "Comprador{" +
                "Nome='" + Nome + '\'' +
                '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
