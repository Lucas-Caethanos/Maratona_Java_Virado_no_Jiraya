package E_OrientacaoObjetos.F_ModificadoresEstatico.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        //Executado antes do cosntrutor toda vez que é criado uma instância do objeto
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime() {

        episodios = new int[50];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        for (int ep : episodios) {
            System.out.print(ep + " ");
        }
    }
}
//https://www.youtube.com/watch?v=HOjV9M6pRQQ&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=65