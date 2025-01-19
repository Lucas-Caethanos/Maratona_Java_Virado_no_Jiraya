package E_OrientacaoObjetos.N_Polimorfismo.Test;

// Importação das classes que representam diferentes tipos de repositórios.
import E_OrientacaoObjetos.N_Polimorfismo.Repositorio.Repositorio;
import E_OrientacaoObjetos.N_Polimorfismo.Servico.RepositorioArquivo;
import E_OrientacaoObjetos.N_Polimorfismo.Servico.RepositorioBancoDeDados;
import E_OrientacaoObjetos.N_Polimorfismo.Servico.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        // Instanciação de um objeto do tipo RepositorioArquivo, mas referenciado pela interface Repositorio. Isso permite usar polimorfismo.
        Repositorio repositorio = new RepositorioArquivo();

        // Chama o método_ salvar() no objeto "repositorio", que, devido ao polimorfismo, pode ser implementado de forma diferente dependendo da classe concreta (RepositoriosArquivo, RepositorioBancoDeDados ou RepositorioMemoria).
        repositorio.salvar();
    }
}
