package E_OrientacaoObjetos.G_Associacao._Exercicio.Dominio;

public class Professor {

    private String nome;

    private String especialidade;

    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){

        System.out.println("----------------------");
        System.out.println("Professor: " + this.nome);

        if (this.seminarios == null) {
            return;
        }

        System.out.println("Seminários cadastrados:");
        System.out.println();

        for (Seminario seminario : this.seminarios){
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());

            if (seminario.getEstudante() == null) {
                continue;
            }

            for (Estudante estudante : seminario.getEstudante()){
                System.out.println("Aluno: " + estudante.getNome() + " " + estudante.getIdade() + " anos");
            }

            System.out.println();
        }

    }










    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


