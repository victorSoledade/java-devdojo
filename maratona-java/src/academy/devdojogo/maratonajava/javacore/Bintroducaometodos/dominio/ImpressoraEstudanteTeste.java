package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudanteTeste {
    public void imprime(EstudanteTeste estudante){
        System.out.println("--------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Yasuo";
    }
}
