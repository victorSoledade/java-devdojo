package academy.devdojogo.maratonajava.javacore.Gassociacao.test;

import academy.devdojogo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojogo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("coldzera");
        Time time = new Time("00Nation");

        jogador1.setTime(time);

        jogador1.imprime();

    }
}
