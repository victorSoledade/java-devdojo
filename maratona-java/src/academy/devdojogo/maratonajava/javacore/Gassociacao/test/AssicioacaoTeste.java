package academy.devdojogo.maratonajava.javacore.Gassociacao.test;

import academy.devdojogo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojogo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojogo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojogo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssicioacaoTeste {
    public static void main(String[] args) {

        Local local = new Local("Rua Epitacio taco melo");
        Aluno aluno = new Aluno("Epitacio", 29);
        Professor professor = new Professor("Fallen", "Awper/IGL");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Road to major", alunos, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }

}
