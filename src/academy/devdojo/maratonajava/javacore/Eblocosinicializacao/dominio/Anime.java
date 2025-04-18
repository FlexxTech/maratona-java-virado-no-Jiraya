package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de classe [e criado e inicializado com valores default ou o quer for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

        for(int episodio:this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
