package LAB2;

import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * Representação de uma disciplina cursada por um aluno.
 * Uma disciplina possui um nome, a quantidade de horas estudadas
 * e quatro notas utilizadas para calcular a média final.
 *
 * @author Anna Rafaela
 */
public class Disciplina {
    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * Quantidade de horas estudadas na disciplina.
     */
    private int horasEstudo;
    /**
     * Notas obtidas pelo aluno nas quatro avaliações da disciplina.
     */
    private double[] notas;

    /**
     * peso das respectivas notas.
     */
    private int[] pesosNotas;

    /**
     * Constrói uma disciplina a partir de seu nome.
     *
     * @param nomeDisciplina nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {

        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
        this.pesosNotas = new int[4];

        for (int i = 0; i < pesosNotas.length; i++) {
            pesosNotas[i] = 1;
        }
    }

    /**
     * Constrói uma disciplina a partir de seu nome e notas.
     *
     * @param nomeDisciplina nome da disciplina
     */

    public Disciplina(String nomeDisciplina, int quantidadeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[quantidadeNotas];
        this.pesosNotas = new int[quantidadeNotas];

        for (int i = 0 ; i < pesosNotas.length; i++){
            pesosNotas[i] = 1;
        }
    }

    /**
     * Constrói uma disciplina a partir de seu nome,notas e peso das notas.
     *
     * @param nomeDisciplina nome da disciplina
     */
    public Disciplina(String nomeDisciplina, int quantidadeNotas, int[] pesosNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[quantidadeNotas];
        this.pesosNotas = pesosNotas;
    }

    /**
     * Cadastra horas de estudo na disciplina.
     * As horas informadas são adicionadas às horas de estudo
     * já cadastradas anteriormente.
     *
     * @param horasEstudo quantidade de horas de estudo a ser adicionada
     */
    public void cadastraHoras(int horasEstudo){
        this.horasEstudo += horasEstudo;
    }

    /**
     * Cadastra uma nota em uma das quatro avaliações da disciplina.
     *
     * @param nota número da avaliação em que a nota será cadastrada
     * @param valorNota valor obtido na avaliação
     */
    public void cadastraNota(int nota,double valorNota){
        notas[nota-1] = valorNota;


    }

    /**
     * Calcula a média aritmética das notas cadastradas na disciplina.
     *
     * @return média das quatro notas da disciplina
     */
    private double media() {
        double soma = 0;
         int somaPesos= 0 ;
        for (int i = 0; i < notas.length; i++) {

            somaPesos += pesosNotas[i];
            soma += notas[i] * pesosNotas[i];
        }

        return  soma / somaPesos;
    }


    /**
     * Verifica se o aluno foi aprovado na disciplina.
     * O aluno é considerado aprovado quando sua média é maior
     * ou igual a 7,0.
     *
     * @return true se o aluno estiver aprovado ou false caso contrário
     */
    public boolean aprovado(){

        return media()>= 7.0;
    }

    /**
     * Retorna uma representação em String da disciplina,
     * contendo seu nome, a quantidade de horas estudadas,
     * a média final e as quatro notas cadastradas.
     *
     * @return representação em String da disciplina
     */
    @Override
    public String toString() {
        return  nomeDisciplina  + " " +  horasEstudo + " " +
                media() +" "+ Arrays.toString(notas);
    }


}
