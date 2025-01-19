package E_OrientacaoObjetos.M_Interfaces.Test;

import E_OrientacaoObjetos.M_Interfaces.Dominio.DataBaseLoader;
import E_OrientacaoObjetos.M_Interfaces.Dominio.DataLoader;
import E_OrientacaoObjetos.M_Interfaces.Dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retriveMaxDataSize();
        DataBaseLoader.retriveMaxDataSize();

    }
}
