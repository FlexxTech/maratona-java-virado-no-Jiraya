package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionarios extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
