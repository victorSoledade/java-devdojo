package academy.devdojogo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {

    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

        for(int episodios : this.episodios) {
            System.out.print(episodios + " ");
        }

        System.out.println();
    }

    public Anime() {
        for(int episodios : this.episodios) {
            System.out.print(episodios + " ");
        }
    }
}
