package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

    Funcionario funcionario01 = new Funcionario();


    funcionario01.setNome("Victor");
    funcionario01.setIdade(18);
    funcionario01.setSalarios(new double[]{2200,2300,2400});

    funcionario01.imprime();
    funcionario01.imprimeMediaSalarial();
    }
}
