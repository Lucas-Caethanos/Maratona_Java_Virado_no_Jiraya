package E_OrientacaoObjetos.K_Enumeracao.Test;

import E_OrientacaoObjetos.K_Enumeracao.Dominio.Cliente;
import E_OrientacaoObjetos.K_Enumeracao.Dominio.ClienteComEnum;
import E_OrientacaoObjetos.K_Enumeracao.Dominio.ClienteComEnumNaClasse;
import E_OrientacaoObjetos.K_Enumeracao.Dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ichigo", "PESSOA_FISICA");
        Cliente cliente2 = new Cliente("Byakuya", "PESSOA_JURIDICA");
        Cliente cliente3 = new Cliente("Renji", "batata");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        System.out.println("------------------------------------");

        //Criando objetos e passando os atributos da enumeração.
        ClienteComEnum clienteComEnum01 = new ClienteComEnum("Ulquiorra", TipoCliente.PESSOA_FISICA);
        ClienteComEnum clienteComEnum02 = new ClienteComEnum("Jugram", TipoCliente.PESSOA_JURIDICA);
        ClienteComEnum clienteComEnum03 = new ClienteComEnum("Yhwach", TipoCliente.PESSOA_FISICA);

        System.out.println(clienteComEnum01);
        System.out.println(clienteComEnum02);
        System.out.println(clienteComEnum03);

        System.out.println("-----------------------------------");

        ClienteComEnumNaClasse clienteComEnumNaClasse01 = new ClienteComEnumNaClasse("Rukia",TipoCliente.PESSOA_FISICA, ClienteComEnumNaClasse.TipoPagamento.CREDITO);
        ClienteComEnumNaClasse clienteComEnumNaClasse02 = new ClienteComEnumNaClasse("Uryu",TipoCliente.PESSOA_JURIDICA, ClienteComEnumNaClasse.TipoPagamento.DEBITO);


        System.out.println(clienteComEnumNaClasse01);
        System.out.println(clienteComEnumNaClasse02);
    }
}

