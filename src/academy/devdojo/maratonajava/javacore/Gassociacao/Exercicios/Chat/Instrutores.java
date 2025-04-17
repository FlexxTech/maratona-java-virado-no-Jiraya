package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.Chat;

public class Instrutores {
    private String nome;
    private String especializacao;
    private Cursos[] cursos;

    public Instrutores(String nome, String especializacao) {
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public Instrutores(String nome, String especializacao, Cursos[] cursos) {
        this.nome = nome;
        this.especializacao = especializacao;
        this.cursos = cursos;
    }

    public void imprime(){
        System.out.println("Instrutor: " + this.nome);
        System.out.println("Especialização: " + this.especializacao);
        if(cursos == null) return;
        for (Cursos curso : cursos) {
            System.out.println("Curso: " + curso.getTitulo());
            System.out.println("Descrição: " + curso.getDescricao());
            System.out.println("Plataforma: " + curso.getPlataformas().getNome());
            if(curso.getAlunos() == null) continue;
            for (Alunos aluno : curso.getAlunos()) {
                System.out.println("Alunos: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }

        }

    }

    public Cursos[] getCursos() {
        return cursos;
    }

    public void setCursos(Cursos[] cursos) {
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
