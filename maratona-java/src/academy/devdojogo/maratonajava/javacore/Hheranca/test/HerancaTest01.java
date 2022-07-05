package academy.devdojogo.maratonajava.javacore.Hheranca.test;

import academy.devdojogo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojogo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojogo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("79756522");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jubileu");
        pessoa.setCpf("9885566447");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Yasuo");
        funcionario.setCpf("99996666");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(0);

        System.out.println("===============");

        funcionario.imprime();


    }
}
