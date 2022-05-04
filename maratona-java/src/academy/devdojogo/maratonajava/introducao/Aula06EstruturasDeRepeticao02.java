package academy.devdojogo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 1000000
        int i = 0;

        while (i<=1000000) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }
    }
}
