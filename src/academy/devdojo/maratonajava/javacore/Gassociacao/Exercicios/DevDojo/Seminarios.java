package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.DevDojo;

public class Seminarios {
    private String titulo;
    private Estudantes[] estudantes;
    private LocalSeminario local;

    public void imprime(){
        System.out.println("Seminario: " + this.titulo);
        if(estudantes == null) return;
        for(Estudantes estudante : estudantes){
            System.out.println(estudante.getNome());
            System.out.println(estudante.getIdade());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public Seminarios(String titulo) {
        this.titulo = titulo;
    }

    public Seminarios(String titulo, Estudantes[] estudantes) {
        this.titulo = titulo;
        this.estudantes = estudantes;
    }

    public Seminarios(String titulo, Estudantes[] estudantes, LocalSeminario local) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudantes[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes;
    }

    public LocalSeminario getLocal() {
        return local;
    }

    public void setLocal(LocalSeminario local) {
        this.local = local;
    }
}
