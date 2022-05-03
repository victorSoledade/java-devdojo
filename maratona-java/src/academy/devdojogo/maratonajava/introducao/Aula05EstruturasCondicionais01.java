package academy.devdojogo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int dinheiro = 500;
        if (dinheiro >= 1500) {
            System.out.println("Compro um psp");
        } else if (dinheiro < 1500 && dinheiro > 1000) {
            System.out.println("Compro um patinete");
        } else {
            System.out.println("Não compro nada");
        }
    }
}
