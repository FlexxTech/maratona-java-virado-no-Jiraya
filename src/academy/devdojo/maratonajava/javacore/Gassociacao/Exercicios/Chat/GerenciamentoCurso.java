package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.Chat;

public class GerenciamentoCurso {
    public static void main(String[] args) {
        Plataformas plataformas = new Plataformas("Youtube","youtube.com.br/devdojo");
        Alunos aluno = new Alunos("Kaique",24);
        Instrutores instrutores = new Instrutores("DevDojo","Java");
        Alunos[] alunos = {aluno};
        Cursos curso = new Cursos("Virado no Jiraya","Curso de Java completo",alunos,plataformas);

        Cursos[] cursos = {curso};
        instrutores.setCursos(cursos);

        instrutores.imprime();
    }
}
