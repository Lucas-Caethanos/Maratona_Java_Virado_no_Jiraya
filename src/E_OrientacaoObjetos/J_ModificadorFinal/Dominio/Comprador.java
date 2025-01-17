package E_OrientacaoObjetos.J_ModificadorFinal.Dominio;

// Classe Comprador que representa uma pessoa que realiza a compra de um carro.
public class Comprador {
    // Atributo privado para armazenar o nome do comprador.
    private String Nome;

    // Sobrescrita do método toString() para personalizar a representação textual do objeto.
    @Override
    public String toString() {
        // Retorna uma string formatada contendo o valor do atributo 'Nome'.
        return "Comprador{" +
                "Nome='" + Nome + '\'' +
                '}';
    }

    // Getter para obter o valor do atributo 'Nome'.
    public String getNome() {
        return Nome;
    }

    // Setter para modificar o valor do atributo 'Nome'.
    public void setNome(String nome) {
        Nome = nome;
    }
}
