package E_OrientacaoObjetos.G_Associacao.dominio;

public class Escola {
    private String nome;

    //Uma escola pode receber vários professores.
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    //Sobrecarregando o construtor
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    //Criando o método de impressão.
    public void imprime() {
        System.out.println(this.nome);

        if (professores != null) {

            for (Professor prof : professores) {
                System.out.println(prof.getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
