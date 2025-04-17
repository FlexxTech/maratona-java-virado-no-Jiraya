package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10){ // Enquanto
            System.out.println(count);
            count++;
        }
        do{
            System.out.println("dentro do do-while");
        }while (count < 10);

        for(int i=0;i<10;i++){ // Para
            System.out.println("For "+i);
        }
    }
}
