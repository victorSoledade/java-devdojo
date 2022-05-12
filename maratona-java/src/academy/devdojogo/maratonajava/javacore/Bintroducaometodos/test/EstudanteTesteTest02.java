package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.EstudanteTeste;


public class EstudanteTesteTest02 {
    public static void main(String[] args) {
        EstudanteTeste estudante01 = new EstudanteTeste();
        EstudanteTeste estudante02 = new EstudanteTeste();
        EstudanteTeste estudante03 = new EstudanteTeste();
        EstudanteTeste estudanteTeste = new EstudanteTeste();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';


        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante03.nome = "Gon";
        estudante03.idade = 12;
        estudante03.sexo = 'M';

        estudante01.imprimeTeste();
        estudante02.imprimeTeste();
        estudante03.imprimeTeste();
    }
}
