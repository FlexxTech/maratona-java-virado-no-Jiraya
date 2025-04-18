package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPgamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPgamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira",TipoCliente.PESSOA_JURIDICA, TipoPgamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPgamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPgamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);
    }
}
