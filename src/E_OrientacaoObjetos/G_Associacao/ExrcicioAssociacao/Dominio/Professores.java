package E_OrientacaoObjetos.G_Associacao.ExrcicioAssociacao.Dominio;

public class Professores {

    private String nome;
    private String especialidade;
    Seminarios[] seminarios;

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores(String nome, String especialidade, Seminarios[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimeProfessor(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if (seminarios == null){
            return;
        }

        for (Seminarios seminario : seminarios) {
            System.out.println("Seminários ministrados:");
            System.out.println(seminario.getTitulo());
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
