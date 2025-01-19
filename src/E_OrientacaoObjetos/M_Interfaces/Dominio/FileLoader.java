package E_OrientacaoObjetos.M_Interfaces.Dominio;

// A classe FileLoader implementa as interfaces DataLoader e DataRemover.
// Isso significa que ela deve fornecer implementações para todos os métodos abstratos das interfaces.
public class FileLoader implements DataLoader, DataRemover{

    // Implementação do método_ load() da interface DataLoader.
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    // Implementação do método_ remove() da interface DataRemover.
    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }
}