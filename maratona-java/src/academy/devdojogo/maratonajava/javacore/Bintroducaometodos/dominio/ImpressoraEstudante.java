package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("----------");
        System.out.println("Aluno: "+estudante.nome+" Idade: "+estudante.idade+" Sexo: "+estudante.sexo);
    }
}
