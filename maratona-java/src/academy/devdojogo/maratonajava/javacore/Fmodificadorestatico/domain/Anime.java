package academy.devdojogo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {

    private String nome;
    private static int[] episodios;

    static {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

        for(int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }

        System.out.println();
    }

    public Anime() {
        for(int episodios : Anime.episodios) {
            System.out.print(episodios + " ");
        }
    }
}
