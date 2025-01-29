package F_Exception.Exception.Test;

import F_Exception.Exception.Dominio.Funcionario;
import F_Exception.Exception.Dominio.LoginInvalidoException;
import F_Exception.Exception.Dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        Funcionario funcionario01 = new Funcionario();

        try {
            funcionario01.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
