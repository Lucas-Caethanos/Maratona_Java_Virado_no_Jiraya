package F_Exception.Exception.Test;

import F_Exception.Exception.Dominio.Leitor01;
import F_Exception.Exception.Dominio.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivoNovo();
    }

    public static void lerArquivo(){

        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException exception){
                exception.printStackTrace();
            }
        }

    }

    public static void lerArquivoNovo() {

        // O java fechou (close()) em ordem inversa
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02 = new Leitor02()) {

        } catch (IOException e) {

        }

    }
}
