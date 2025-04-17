package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double result = numero01 / (double) numero02;
        System.out.println(result);

        // % - Resto
        int resto = 20 % 2;
        System.out.println(resto);

        // Lógicos - < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMenorQueVinte);

        // Lógicos && (AND) |  !

        int age = 24;
        float salary = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        // Lógicos - ||(or)

        double valorTotalContaCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel"+isPlaystationCincoCompravel);

        // Operadores de Atribuição - = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0.0
        System.out.println(bonus);

        // Operadores Unarios
        int contador = 0;
        contador += 1;
        contador++; // Ele primeiro roda e depois incrementa
        contador--;
        --contador; // Ele primeiro incrementa e depois roda
        ++contador;
        System.out.println(contador);
    }
}
