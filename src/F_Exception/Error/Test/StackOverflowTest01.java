package F_Exception.Error.Test;

public class StackOverflowTest01 {
    public static void main(String[] args) {

    recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
