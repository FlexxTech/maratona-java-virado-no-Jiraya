package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private  TipoPgamento tipoPgamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPgamento tipoPgamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPgamento = tipoPgamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoClienteInt=" + tipoCliente.getNomeRelatorio() +
                ", tipoCliente=" + tipoCliente.getValor() +
                ", tipoPgamento=" + tipoPgamento +
                '}';
    }
}
