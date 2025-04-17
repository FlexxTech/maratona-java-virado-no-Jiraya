package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.DevDojo;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;

    public Professores(String nome, String especialidade, Seminarios[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(seminarios == null) return;
        for(Seminarios seminario : seminarios){
            System.out.println("Seminário: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if(seminario.getEstudantes() == null) continue;
            for (Estudantes estudante : seminario.getEstudantes()) {
                System.out.println("Alunos: " + estudante.getNome() + " Idade: " + estudante.getIdade());
            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }
}
