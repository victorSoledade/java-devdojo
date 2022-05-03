package academy.devdojogo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 15;
        String categoria = "";

        if (idade >= 18) {
            categoria = "Você está na categoria adulto";
        } else if (idade < 18 && idade >= 15) {
            categoria = "Você está na categoria juvenil";
        } else {
            categoria = "Você está na categoria infantil";
        }
        System.out.println(categoria);
    }
}
