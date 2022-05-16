package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ProfessorTeste {
    private String nome;
    private int idade;
    private String disciplina;
    private double[] salarios;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    public double[] getSalarios(){
        return salarios;
    }

    public void imprime() {
        System.out.println("#########");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.disciplina);
    }

    public void mediaSalarios(){
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial de: "+media);
    }
}


