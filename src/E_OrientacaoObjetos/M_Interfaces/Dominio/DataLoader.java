package E_OrientacaoObjetos.M_Interfaces.Dominio;

public interface DataLoader {

    // Constante definida com public static final por padrão. Não é necessário declarar explicitamente essas palavras-chave.
    public static final int MAX_DATA_SIZE = 10;

    // Método_ abstrato, que deve ser implementado pelas classes que utilizarem esta interface.
    public abstract void load(); // por padrão o método_ é público e abstrato

    // Método_ default permite fornecer uma implementação concreta na interface.
    // Classes que implementam a interface podem utilizar este método_ diretamente ou sobrescrevê-lo.
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    // Método_ estático, que pertence à interface e não às instâncias. Não pode ser sobrescrito pelas classes que implementam a interface.
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");
    }

}
