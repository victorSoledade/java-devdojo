package academy.devdojogo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {

    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public void imprime() {
        System.out.println("-----------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade maxima " + this.velocidadeMaxima);
        System.out.println("Veolidade limite " + Carro.velocidadeLimite);
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
