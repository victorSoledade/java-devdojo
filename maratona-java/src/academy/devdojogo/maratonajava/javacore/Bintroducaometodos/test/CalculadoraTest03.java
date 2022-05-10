package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        //ou
        System.out.println(calculadora.divideDoisNumeros(20,2));
        System.out.println("--------------");
        calculadora.divideDoisNumeros02(20,2);
    }
}
