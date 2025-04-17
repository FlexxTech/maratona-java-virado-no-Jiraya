package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L; // Chamamos de casting que forçamos a entrada do valor
        long numberLong = 100000;
        double wageDouble = 2000;
        float wageFloat = 250.0F; // colocamos o F para dizer que é um float explicito
        byte ageByte = 10;
        short ageShort = 10;
        boolean True = true;
        boolean False = false;
        char caractere = 'M';

        String name = "Kaique";

        System.out.println("Oi meu nome é "+name);

    }
}
