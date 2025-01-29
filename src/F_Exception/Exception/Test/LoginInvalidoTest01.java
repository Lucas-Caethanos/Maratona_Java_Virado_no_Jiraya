package F_Exception.Exception.Test;

import F_Exception.Exception.Dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDb = "ssj";

        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();

        System.out.println("Senha");
        String senhaDigitado = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDb.equals(senhaDigitado)) {
            throw new LoginInvalidoException("Login inválido (sobrescrito)");

        }

        System.out.println("Usuário logado com sucesso");

    }
}
