package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[] array = {3,4,5}; // Forma 1 de inializar o array
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2]; // Diz que vai ter duas posições
        arrayInt[1] = array; // Forma 1 de inializar o array
        arrayInt[2] = new int[]{6,7,8,9}; // Já colocamos os indices do Array

        // Outra forma de inicializar o Array
        // Aqui já dizemos quantos iremos inicializar no caso sera 3 pois temos 3 {}
        // e já colocamos a referencia de cada Array
        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};


        for(int[] arrayBase: arrayInt2){
            System.out.println("\n----------");
            for(int num:arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
