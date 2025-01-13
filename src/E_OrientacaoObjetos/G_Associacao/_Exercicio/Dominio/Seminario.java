package E_OrientacaoObjetos.G_Associacao._Exercicio.Dominio;

public class Seminario {

    private String titulo;

    private Estudante[] estudante;

    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Estudante[] estudante) {
        this.titulo = titulo;
        this.estudante = estudante;
    }

    public Seminario(String titulo, Estudante[] estudante, Local local) {
        this.titulo = titulo;
        this.estudante = estudante;
        this.local = local;
    }

    public Estudante[] getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante[] estudante) {
        this.estudante = estudante;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
