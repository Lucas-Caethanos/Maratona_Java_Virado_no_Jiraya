package E_OrientacaoObjetos.B_IntruducaoMetodos.Dominio;

public class EstudanteMetodos {
    public String nome;
    public int idade;
    public char sexo;

    //Não precisamos passar um parâmtro quando o método está dentro da classe que cria o objeto
    //Usamos o this para pegar as variáveis que foram declaradas na própria classe
    public void imprime(){ //tem acesso a tudo
        System.out.println(this.nome);
        System.out.println(this.sexo);
        System.out.println(this.idade);

    }

}
