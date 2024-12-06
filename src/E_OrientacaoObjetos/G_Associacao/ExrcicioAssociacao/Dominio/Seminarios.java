package E_OrientacaoObjetos.G_Associacao.ExrcicioAssociacao.Dominio;

public class Seminarios {
    private String titulo;
    Estudantes[] estudantes;
    Local local;

    public Seminarios(String titulo, Estudantes[] estudantes, Local local) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
    }

    public void imprimeSeminario(){
        System.out.println("Título do seminário: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());

        if (estudantes == null){
            return;
        }

        int i = 1;

        for (Estudantes estudante : estudantes) {
            System.out.println("Aluno " + i + ": " + estudante.getNome() + ", idade: " + estudante.getIdade());
            i++;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudantes[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
