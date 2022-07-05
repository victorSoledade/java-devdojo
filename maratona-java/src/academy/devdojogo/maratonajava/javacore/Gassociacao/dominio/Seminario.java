package academy.devdojogo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] aluno, Local local) {
        this.titulo = titulo;
        this.alunos = aluno;
        this.local = local;
    }

    public Aluno[] getAluno() {
        return alunos;
    }

    public void setAluno(Aluno[] aluno) {
        this.alunos = aluno;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
