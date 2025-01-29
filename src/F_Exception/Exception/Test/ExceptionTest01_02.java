package F_Exception.Exception.Test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01_02 {
    public static void main(String[] args) throws IOException{

        criarNovoArquivo();
    }

    // Geralmente usamos throws para arquivos public, já em private usamos o throw
    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
