package E_OrientacaoObjetos.G_Associacao.dominio;

public class Time {
    private String nome;

    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadors) {
        this.nome = nome;
        this.jogadores = jogadors;
    }

    public void imprime(){
        System.out.println(this.nome);

        if (jogadores != null){
            for (Jogador joga : jogadores) {
                System.out.println(joga.getNome());
            }
        }else {
            return;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadors() {
        return jogadores;
    }

    public void setJogadors(Jogador[] jogadors) {
        this.jogadores = jogadors;
    }
}
