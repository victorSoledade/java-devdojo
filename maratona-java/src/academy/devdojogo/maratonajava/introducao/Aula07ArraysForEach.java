package academy.devdojogo.maratonajava.introducao;

import java.util.Random;

public class Aula07ArraysForEach {
    public static void main(String[] args) {
        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Usando o for each");

        for (int nota : notas) {
            System.out.println(nota);
        }

//        System.out.println("\nCom for normal\n");
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println(notas[i]);
//        }

        //exemplo 02
        System.out.println("Exemplo com arrays multidimensionais");

        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 1;
        notasAlunos[0][2] = 2;
        notasAlunos[0][3] = 7;

        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 1;
        notasAlunos[1][2] = 2;
        notasAlunos[1][3] = 7;

        notasAlunos[2][0] = 0;
        notasAlunos[2][1] = 1;
        notasAlunos[2][2] = 5;
        notasAlunos[2][3] = 9;

        for ( double[] notasAluno : notasAlunos) {
            for (double nota : notasAluno) {
                System.out.println(nota + " ");
            }
            System.out.println(" ");
        }
    }
}
