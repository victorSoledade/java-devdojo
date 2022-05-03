package academy.devdojogo.maratonajava.introducao;

/*
* Prática
*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereço>,
* confirmo que eu recebi o salário de <salário>, na data <data>.
* */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Victor";
        String endereco = "Q19 L17 JDB 1";
        float salario = 1200.60F;
        String dataRecebimento = "17/4";
        String relatorio = "Eu " +nome+ ", morando no endereço " +
                endereco+"\n, confirmo que eu recebi o salario de " +
                salario+", na data " + dataRecebimento+".";
        System.out.println(relatorio);
    }
}
