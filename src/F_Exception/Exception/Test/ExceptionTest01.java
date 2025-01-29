package F_Exception.Exception.Test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);

        } catch (IOException e){
            // Nunca deixar em branco, não usamos o catch para regras de negócio
            System.out.println("------ Dentro do catch ------");

            e.printStackTrace();

        }


    }
}
