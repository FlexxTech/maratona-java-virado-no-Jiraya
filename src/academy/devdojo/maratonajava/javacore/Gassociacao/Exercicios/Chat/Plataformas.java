package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicios.Chat;

public class Plataformas {
    private String nome;
    private String url;

    public Plataformas(String nome, String url) {
        this.nome = nome;
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
