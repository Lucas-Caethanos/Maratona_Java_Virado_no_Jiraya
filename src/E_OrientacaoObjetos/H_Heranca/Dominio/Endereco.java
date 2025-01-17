package E_OrientacaoObjetos.H_Heranca.Dominio;

// Classe Endereco que representa o endereço de uma pessoa.
public class Endereco {

    // Atributo privado para armazenar o nome da rua.
    private String rua;
    // Atributo privado para armazenar o código postal (CEP).
    private String cep;

    // Getter para obter o valor do atributo 'rua'.
    public String getRua() {
        return rua;
    }

    // Setter para modificar o valor do atributo 'rua'.
    public void setRua(String rua) {
        this.rua = rua;
    }

    // Getter para obter o valor do atributo 'cep'.
    public String getCep() {
        return cep;
    }

    // Setter para modificar o valor do atributo 'cep'.
    public void setCep(String cep) {
        this.cep = cep;
    }
}
