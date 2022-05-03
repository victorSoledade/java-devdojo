package academy.devdojogo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String doar = "Eu vou doar 500 pro devdojo.";
        String naodoar = "Não tenho condições ainda.";
        String resultado = salario > 5000 ? doar : naodoar;
        System.out.println(resultado);

    }
}
