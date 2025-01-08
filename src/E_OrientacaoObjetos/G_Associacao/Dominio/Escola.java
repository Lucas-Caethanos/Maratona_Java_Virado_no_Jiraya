package E_OrientacaoObjetos.G_Associacao.Dominio;

public class Escola {
    private String nome; // Nome da escola

    // Uma escola pode receber vários professores.
    private Professor[] professores; // Array para armazenar os professores associados à escola

    // Construtor que inicializa apenas o nome da escola
    public Escola(String nome) {
        this.nome = nome;
    }

    // Construtor sobrecarregado que inicializa o nome da escola e os professores associados
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    // Método_ que imprime o nome da escola e os professores associados
    public void imprime() {
        System.out.println(this.nome); // Imprime o nome da escola

        // Verifica se o array de professores não é nulo antes de iterar
        if (professores != null) {
            for (Professor prof : professores) { // Itera sobre o array de professores
                System.out.println(prof.getNome()); // Imprime o nome de cada professor
            }
        }
    }

    // Métodos getters e setters para acessar e modificar os atributos privados

    public String getNome() {
        return nome; // Retorna o nome da escola
    }

    public void setNome(String nome) {
        this.nome = nome; // Define um novo nome para a escola
    }

    public Professor[] getProfessores() {
        return professores; // Retorna o array de professores associados à escola
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores; // Define um novo array de professores para a escola
    }
}
