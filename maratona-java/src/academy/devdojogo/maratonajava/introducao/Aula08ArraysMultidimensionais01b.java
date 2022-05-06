package academy.devdojogo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01b {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        numeros[0][0] = 1;
        numeros[0][1] = 1;
        numeros[0][2] = 1;

        numeros[1][0] = 1;
        numeros[1][1] = 1;
        numeros[1][2] = 1;

        numeros[2][0] = 1;
        numeros[2][1] = 1;
        numeros[2][2] = 1;

        for (int[] i: numeros) {
            for (int num: i) {
                System.out.println(num);
            }
        }

    }
}
