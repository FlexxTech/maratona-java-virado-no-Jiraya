package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.DevDojo;

public class SeminarioEx {
    public static void main(String[] args) {
        LocalSeminario local = new LocalSeminario("Parque Municipal");
        Estudantes estudante1 = new Estudantes("Kaique",24);
        Professores professor1 = new Professores("DevDojo","Java");
        Estudantes[] estudantes = {estudante1};
        Seminarios seminario1 = new Seminarios("IA",estudantes,local);

        Seminarios[] seminarios = {seminario1};
        professor1.setSeminarios(seminarios);

        professor1.imprime();
    }
}
