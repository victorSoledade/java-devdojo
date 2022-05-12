package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.EstudanteTeste;
import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudanteTeste;

public class EstudanteTesteTest01 {
    public static void main(String[] args) {
        EstudanteTeste estudante01 = new EstudanteTeste();
        EstudanteTeste estudante02 = new EstudanteTeste();
        ImpressoraEstudanteTeste impressora = new ImpressoraEstudanteTeste();

        estudante01.nome = "Killua";
        estudante01.idade = 12;
        estudante01.sexo = 'M';

        estudante02.nome = "Zed";
        estudante02.idade = 30;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
