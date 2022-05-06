package academy.devdojogo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojogo.maratonajava.javacore.Aintroducaoclasses.dominio.PessoaTest;

public class PessoaTestTest01 {
    public static void main(String[] args) {
        PessoaTest pessoa = new PessoaTest();
        pessoa.elo = "Prata";
        pessoa.idade = 18;
        pessoa.nome = "Victor";
        System.out.println(pessoa.elo);
        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
    }
}
