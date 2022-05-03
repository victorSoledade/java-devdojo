package academy.devdojogo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 4;

        switch (dia) {
            case 1:
                System.out.println("Não é dia útil");
                break;
            case 2:
                System.out.println("É dia útil");
                break;
            case 3:
                System.out.println("É dia útil");
                break;
            case 4:
                System.out.println("É dia útil");
                break;
            case 5:
                System.out.println("É dia útil");
                break;
            case 6:
                System.out.println("É dia útil");
                break;
            case 7:
                System.out.println("Não é dia útil");
                break;
            default:
                System.out.println("Houve algum erro, digite um valor entre 1 e 7");
                break;
        }
    }
}
