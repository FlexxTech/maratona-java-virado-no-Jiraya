package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da Superclasse é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar classe filha
    // 2 - Alocado espaco em memoria pro objeto da classe Pai
    // 3 - Cada atributo de classe [e criado e inicializado com valores default ou o quer for passada
    // 4 - Bloco de inicialização é executado
    // 5 - Construtor é executado
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
