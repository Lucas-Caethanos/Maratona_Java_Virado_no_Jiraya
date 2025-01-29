package F_Exception.Runtime.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

//        try {
//            throw new IllegalArgumentException();
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
//
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Dentro do IndexOutOfBoundsException");
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("Dentro do IllegalArgumentException");
//
//        } catch (ArithmeticException e) {
//            System.out.println("Dentro do ArithmeticException");
//
//        } catch (RuntimeException e) {
//            // Esse é um tipo mais abrangente
//            System.out.println("Dentro do RuntimeException");
//        }

        try {
            talvezLanceException();
        } catch (IOException | SQLException e ){
            System.out.println("Dentro do Multi catch em linha");
            e.printStackTrace();

        }

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        throw new SQLException();
    }

}
