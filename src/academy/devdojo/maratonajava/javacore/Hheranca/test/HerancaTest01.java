package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Miguel Terlizzi");
        endereco.setCep("18523-188");
        Pessoa pessoa = new Pessoa("Kaique");
        pessoa.setCpf("654121678-20");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("João");
        funcionario.setCpf("12312341232");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("--------------");
        funcionario.imprime();
    }
}
