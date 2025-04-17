package academy.devdojo.maratonajava.javacore.Fmodificadoresstatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe [e criado e inicializado com valores default ou o quer for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

        for(int episodio:Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
