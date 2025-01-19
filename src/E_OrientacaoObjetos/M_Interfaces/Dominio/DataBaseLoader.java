package E_OrientacaoObjetos.M_Interfaces.Dominio;

// A classe DataBaseLoader implementa as interfaces DataLoader e DataRemover.
// Ela é obrigada a fornecer implementações para os métodos abstratos das interfaces.
public class DataBaseLoader implements DataLoader, DataRemover{

    // Sobrescrevendo o método_ default checkPermission() da interface DataLoader.
    // Como o método_ default tem uma implementação padrão, não é obrigatório sobrescrevê-lo, mas pode ser feito se necessário.
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões (Override)");
    }

    // Implementação do método_ abstrato load() da interface DataLoader.
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    // Implementação do método_ abstrato remove() da interface DataRemover.
    @Override
    public void remove() {
        System.out.println("Deletando dados do banco de dados");
    }

    // Método_ estático com o mesmo nome de um método_ na interface DataLoader.
    // Este método_ não é sobrescrito, pois métodos estáticos não podem ser sobrescritos em Java.
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na classe DataBaseLoader");
    }

}