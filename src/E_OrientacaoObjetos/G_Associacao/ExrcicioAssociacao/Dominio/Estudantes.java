package E_OrientacaoObjetos.G_Associacao.ExrcicioAssociacao.Dominio;

public class Estudantes {
    private String nome;
    private int idade;
    Seminarios seminario;


    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimeAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (seminario != null){
            System.out.println("Seminario: " + seminario.getTitulo());
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminarios getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminarios seminario) {
        this.seminario = seminario;
    }
}
