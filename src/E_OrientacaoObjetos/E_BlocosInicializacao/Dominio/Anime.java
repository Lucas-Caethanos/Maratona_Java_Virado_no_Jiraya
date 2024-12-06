package E_OrientacaoObjetos.E_BlocosInicializacao.Dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
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
