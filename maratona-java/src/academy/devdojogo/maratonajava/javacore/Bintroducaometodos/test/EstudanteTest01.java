package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';


        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante03.nome = "Gon";
        estudante03.idade = 12;
        estudante03.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        impressora.imprime(estudante03);

    }
}
