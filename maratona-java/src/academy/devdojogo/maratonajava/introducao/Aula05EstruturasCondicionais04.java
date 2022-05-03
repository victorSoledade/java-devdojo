package academy.devdojogo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 62000;
        String resultado = "";
        double calc1 =  salario * 0.097;
        double calc2 = salario * 0.3735;
        double calc3 = salario * 0.4950;

        if (salario > 0 && salario <= 34712) {
            resultado = "Taxa de 9,70% que seria "+calc1+" do seu salario";
        } else if (salario > 34712 && salario < 68507) {
            resultado = "Taxa de 37,35% que seria "+calc2+" do seu salario";
        } else {
            resultado = "Taxa de 49.50% que seria "+calc3+" do seu salario";
        }

        System.out.println(resultado);
    }
}
