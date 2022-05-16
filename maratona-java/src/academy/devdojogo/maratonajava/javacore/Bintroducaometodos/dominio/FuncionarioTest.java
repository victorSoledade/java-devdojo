package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioTest {
    private String nome;
    private int idade;
    private double[] salarios;

    public void imprimeFuncionario(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios){
            System.out.print(salario + " ");
        }
    }

    public void imprimeMediaSalario(){
        double media = 0;
        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial "+ media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
