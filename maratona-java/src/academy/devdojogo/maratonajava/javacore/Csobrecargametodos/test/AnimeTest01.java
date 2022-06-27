package academy.devdojogo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojogo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {

    // sobrecarga de métodos é poder criar um construtor com mesmo nome, passando mais parametros ou tipo diferentes

    public static void main(String[] args) {


        Anime anime = new Anime("hxh","acao",300,"Acao", "Ghibli");

        anime.imprime();

    }
}
