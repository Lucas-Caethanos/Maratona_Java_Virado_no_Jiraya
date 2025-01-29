package F_Exception.Exception.Dominio;

public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String menssage) {
        super(menssage);
    }

}
