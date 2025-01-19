package E_OrientacaoObjetos.M_Interfaces.Dominio;

public class DataBaseLoader implements DataLoader, DataRemover{

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões (Override)");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados do banco de dados");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na classe DataBaseLoader");

    }

}
