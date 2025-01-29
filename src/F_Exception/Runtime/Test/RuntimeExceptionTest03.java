package F_Exception.Runtime.Test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        abreConexao();

    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
//            System.out.println("Escrevendo dados no arquivo");

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }

    }
}
