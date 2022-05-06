package academy.devdojogo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojogo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Corsa";
        carro.ano = 2001;
        carro.modelo = "2bc4";

        carro2.nome = "Chevette";
        carro2.ano = 1994;
        carro2.modelo = "2bc9";

        //carro1 = carro2; para deixar os dois objetos iguais

        System.out.println("Carro1");
        System.out.println(carro.nome);
        System.out.println(carro.ano);
        System.out.println(carro.modelo);

        System.out.println("----------------");

        System.out.println("\nCarro2");
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);
    }
}
