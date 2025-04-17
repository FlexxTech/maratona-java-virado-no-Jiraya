package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.Chat;

public class Alunos {
    private String nome;
    private int idade;
    private Cursos cursos;

    public Alunos(String nome, int idade) {
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
