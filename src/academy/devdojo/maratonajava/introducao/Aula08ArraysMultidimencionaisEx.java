package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionaisEx {
    public static void main(String[] args) {
        int[][] number = {{0,0},{0,1,2},{0,1,2,3,4}};
        for(int[] intBase:number){
            System.out.println("\n----------");
            for(int num:intBase){
                System.out.print(num);
            }
        }

    }
}
