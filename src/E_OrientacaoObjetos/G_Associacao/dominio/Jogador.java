package E_OrientacaoObjetos.G_Associacao.dominio;

public class Jogador {
    private String nome;

    //Criando a relação entre a classe Jogador e a classe Time
    private Time time;

    public void imprime(){
        System.out.println(this.nome);

        //Fazendo a validação so time
        if (time != null){
            System.out.println(time.getNome());
        }else {
            System.out.println("O jogador não tem time");
        }
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
