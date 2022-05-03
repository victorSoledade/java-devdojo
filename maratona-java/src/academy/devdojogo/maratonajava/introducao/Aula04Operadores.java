package academy.devdojogo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 * numero2;
        System.out.println("Resultado " + resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == != (retornam valores booleanos)

        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        boolean isDezIugalDez = 10 == 10;
        System.out.println("isDezIgualDez "+isDezIugalDez);
        boolean isDezIugalDiferenteDez = 10 != 10;
        System.out.println("isDezDiferenteDez "+isDezIugalDiferenteDez);

        // || && !
        int idade = 19;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("IsDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeimenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel "+isPlayStationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800; // 1800
        bonus = bonus + 1000; // == bonus += 1000;
        bonus -= 1000; // 1800
        bonus *= 2; // 3600 / == bonus = bonus * 2;
        System.out.println(bonus);

        // ++ -- incrementador e decrementador

        int contador = 0;
        contador++; // contador = contador + 1; ou contador = contador--
        System.out.println(contador);
    }

}
