package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.DevDojo;

public class Estudantes {
    private String nome;
    private int idade;
    private Seminarios seminarios;

    public void imprime(){
        System.out.println("Estudante: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (seminarios != null){
            System.out.println(seminarios.getTitulo());
        }
    }

    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
