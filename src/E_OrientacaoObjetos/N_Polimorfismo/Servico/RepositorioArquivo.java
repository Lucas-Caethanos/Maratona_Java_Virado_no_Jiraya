package E_OrientacaoObjetos.N_Polimorfismo.Servico;

import E_OrientacaoObjetos.N_Polimorfismo.Repositorio.Repositorio;

// Classe que implementa a interface Repositorio e simula o salvamento em um arquivo.
public class RepositorioArquivo implements Repositorio {

    // Implementação do método_ salvar definido na interface Repositorio.
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo...");
    }

}
