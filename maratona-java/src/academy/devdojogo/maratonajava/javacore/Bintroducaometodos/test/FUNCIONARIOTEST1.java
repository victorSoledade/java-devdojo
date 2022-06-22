package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.FUNCIONARIO1;

import java.util.Scanner;

public class FUNCIONARIOTEST1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        FUNCIONARIO1 funcionario = new FUNCIONARIO1();

        funcionario.setNome("Victor");
        funcionario.setIdade(18);
        double[] salarios = new double[3];

        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Digte um salario");
            salarios[i] = scan.nextDouble();
        }

        funcionario.setSalario(salarios);

        funcionario.imprimirDados();











    }
}
