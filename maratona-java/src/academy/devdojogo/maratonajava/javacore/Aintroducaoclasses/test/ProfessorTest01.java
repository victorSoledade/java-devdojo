package academy.devdojogo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojogo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Girafales";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " " + "idade: " +professor.idade + " " + "Sexo: " +professor.sexo);

    }
}
