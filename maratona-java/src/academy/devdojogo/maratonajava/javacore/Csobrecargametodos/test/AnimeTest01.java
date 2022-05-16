package academy.devdojogo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojogo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("Akudama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);

        anime.imprime();
    }
}
