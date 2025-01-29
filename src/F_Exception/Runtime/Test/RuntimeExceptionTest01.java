package F_Exception.Runtime.Test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked e Unchecked

        // NullPointerException
//        Object object = null;
//        System.out.println(object.toString());

        // ArrayIndexOutOfBoundsException
        int[] num = {1, 2};
        System.out.println(num[3]);

    }
}
