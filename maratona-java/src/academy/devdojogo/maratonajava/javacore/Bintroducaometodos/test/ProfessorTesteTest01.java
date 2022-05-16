package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio.ProfessorTeste;

public class ProfessorTesteTest01 {
    public static void main(String[] args) {
        ProfessorTeste professor01 = new ProfessorTeste();
        ProfessorTeste professor02 = new ProfessorTeste();

        professor01.setNome("Heimerdinger");
        professor01.setIdade(300);
        professor01.setDisciplina("Eletrônica");
        professor01.setSalarios(new double[]{2000, 2000, 3000});

        professor02.setNome("Jiraya");
        professor02.setIdade(70);
        professor02.setDisciplina("Jutsus");
        professor02.setSalarios(new double[]{5000, 10000, 3000});

        professor01.imprime();
        professor01.mediaSalarios();

        professor02.imprime();
        professor02.mediaSalarios();
    }
}
