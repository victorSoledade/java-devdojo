package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioTest;

public class FuncionarioTesteTest01 {
    public static void main(String[] args) {
        FuncionarioTest funcionarioTest01 = new FuncionarioTest();
        funcionarioTest01.nome = "Omen";
        funcionarioTest01.idade = 70;
        funcionarioTest01.salarios = new double[]{999.9, 1255, 3568.08};

        funcionarioTest01.imprimeFuncionario();
        funcionarioTest01.imprimeMediaSalario();
    }
}
