package F_Exception.Runtime.Test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(10, 0));

    }

    /**
     * @param a
     * @param b (não pode ser 0)
     * @return divisão de a e b
     * @throws IllegalArgumentException caso b = 0
     */

    private static int divisao(int a, int b) throws IllegalArgumentException{

        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero!");
        }

        return a / b;

//        try {
//            return a / b;
//
//        } catch (RuntimeException e){
//            e.printStackTrace();
//
//        }
//        return 0;

    }
}
