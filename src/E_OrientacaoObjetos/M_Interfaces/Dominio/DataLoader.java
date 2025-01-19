package E_OrientacaoObjetos.M_Interfaces.Dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10; // public static final (redundante)

    public abstract void load(); // por padrão o método_ é público e abstrato

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface");

    }

}
