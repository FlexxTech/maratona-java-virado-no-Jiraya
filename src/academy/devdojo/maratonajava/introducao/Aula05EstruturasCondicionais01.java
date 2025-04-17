package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // ! - Negação
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida Alcólica");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Você não tem autorização para comprar bebidas");
        }
        System.out.println("Fora do If");
    }
}
