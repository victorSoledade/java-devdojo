package academy.devdojogo.maratonajava.javacore.Bintroducaometodos.dominio;

public class MetodoTeste {
    public void SomaTeste(){
        System.out.println(5+5);
    }

    public int divideDoisNumerosTeste(double num1, double num2){
        if(num2 == 0) {
            return 0;
        }
        return (int)(num1/num2);
    }
}
