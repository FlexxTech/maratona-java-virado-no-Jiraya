package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.Chat;

public class Cursos {
    private String titulo;
    private String descricao;
    private Alunos[] alunos;
    private Plataformas plataformas;

    public Cursos(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public Cursos(String titulo, String descricao, Alunos[] alunos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.alunos = alunos;
    }

    public Cursos(String titulo, String descricao, Alunos[] alunos, Plataformas plataformas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.alunos = alunos;
        this.plataformas = plataformas;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Plataformas getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(Plataformas plataformas) {
        this.plataformas = plataformas;
    }
}
