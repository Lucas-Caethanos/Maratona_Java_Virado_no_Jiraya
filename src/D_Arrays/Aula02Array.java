package D_Arrays;

public class Aula02Array {
    public static void main(String[] args) {

//        String[] nomes = new String[3];
        String[] nomes = {"Goku","Naruto","Ichigo"};
//        nomes[0] = "Goku";
//        nomes[1] = "Naruto";
//        nomes[2] = "Ichigo";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        for (String num : nomes){
            System.out.println(num);
        }
    }
}
