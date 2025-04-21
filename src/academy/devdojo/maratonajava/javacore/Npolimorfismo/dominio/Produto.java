package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Produto {
    private String nome;
    private double valor;


    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
}
