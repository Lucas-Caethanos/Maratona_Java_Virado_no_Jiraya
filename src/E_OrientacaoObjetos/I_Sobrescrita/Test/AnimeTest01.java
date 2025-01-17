package E_OrientacaoObjetos.I_Sobrescrita.Test;

// Importa a classe Anime do pacote apropriado.
import E_OrientacaoObjetos.I_Sobrescrita.Dominio.Anime;

// Classe de teste para verificar o funcionamento da classe Anime.
public class AnimeTest01 {
    public static void main(String[] args) {
        // Cria um objeto da classe Anime e inicializa o atributo 'nome' com "Bleach".
        Anime anime = new Anime("Bleach");

        // Imprime o objeto utilizando o método_ toString().
        // O método_ toString() foi sobrescrito na classe Anime, então, ao invés de imprimir algo como "E_OrientacaoObjetos.I_Sobrescrita.Dominio.Anime@<hashcode>", será exibida uma string personalizada no formato definido: "Anime{nome='Bleach'}".
        System.out.println(anime);
    }
}
