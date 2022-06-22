package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FUNCIONARIO1 {

    private String nome;
    private int idade;
    private double[] salarios;

    double soma = 0;

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

    public double[] getSalario() {
        return salarios;
    }

    public void setSalario(double[] salario) {
        this.salarios = salario;
    }

    public double mediaSalarios() {

        for (int i = 0; i < this.salarios.length; i++) {

            soma += salarios[i];

        }

        return soma / salarios.length;

    }

    public void imprimirDados() {

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.idade);

        for (int i = 0; i < this.salarios.length; i++) {
            System.out.println(salarios[i]);
        }

        System.out.print("A media do salário é: " + mediaSalarios());

    }




}
