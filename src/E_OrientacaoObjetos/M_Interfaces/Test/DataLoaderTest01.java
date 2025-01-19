package E_OrientacaoObjetos.M_Interfaces.Test;

import E_OrientacaoObjetos.M_Interfaces.Dominio.DataBaseLoader;
import E_OrientacaoObjetos.M_Interfaces.Dominio.DataLoader;
import E_OrientacaoObjetos.M_Interfaces.Dominio.FileLoader;

// Classe para testar as implementações das interfaces DataLoader e DataRemover.
public class DataLoaderTest01 {
    public static void main(String[] args) {
        // Instanciando objetos de DataBaseLoader e FileLoader.
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        // Chamando os métodos load() implementados em cada classe.
        dataBaseLoader.load(); // Saída: Carregando dados do banco de dados
        fileLoader.load();     // Saída: Carregando dados de um arquivo

        // Chamando os métodos remove() implementados em cada classe.
        dataBaseLoader.remove(); // Saída: Deletando dados do banco de dados
        fileLoader.remove();     // Saída: Deletando dados de um arquivo

        // Chamando o método_ checkPermission() (sobrescrito na classe DataBaseLoader e herdado por FileLoader).
        dataBaseLoader.checkPermission(); // Saída: Checando permissões (Override)
        fileLoader.checkPermission();     // Saída: Fazendo checagem de permissões

        // Chamando o método_ estático retriveMaxDataSize().
        // Note que este método_ pertence à interface e à classe específica, e não às instâncias.
        DataLoader.retriveMaxDataSize();     // Saída: Dentro do retriveMaxDataSize na interface
        DataBaseLoader.retriveMaxDataSize(); // Saída: Dentro do retriveMaxDataSize na classe DataBaseLoader
    }
}
