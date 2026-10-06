package LAB2;
/**
 * Representação do registro de tempo investido em atividades online
 * de uma disciplina. O registro armazena o tempo investido e o tempo
 * esperado para a disciplina.
 *
 * @author Anna Rafaela
 */
public class RegistroTempoOnline {
    /**
     * Nome da disciplina relacionada ao registro de tempo online.
     */
    private String nomeDisciplina;

    /**
     * Quantidade de tempo investido pelo aluno em atividades online
     * da disciplina.
     */
    private int tempoinvestidoOnline;

    /**
     * Quantidade de tempo esperada para ser investida online
     * na disciplina.
     */
    private int tempoEsperado;

    /**
     * Constrói um registro de tempo online a partir do nome
     * da disciplina.
     *
     * @param nomeDisciplina nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {

        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * Constrói um registro de tempo online a partir do nome
     * da disciplina e do tempo esperado.
     *
     * @param nomeDisciplina nome da disciplina
     * @param tempoEsperado tempo esperado de estudo online
     */

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.tempoEsperado = tempoEsperado;
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * Adiciona uma quantidade de tempo ao tempo já investido
     * em atividades online da disciplina.
     *
     * @param tempoinvestidoOnline quantidade de tempo a ser adicionada
     */
    public void adicionaTempoOnline(int tempoinvestidoOnline) {
        this.tempoinvestidoOnline += tempoinvestidoOnline;

    }

    /**
     * Verifica se o tempo investido online atingiu a meta
     * de tempo esperada para a disciplina.
     *
     * @return true se o tempo investido for maior ou igual ao
     * tempo esperado, ou false caso contrário
     */
    public boolean atingiuMetaTempoOnline() {
        if (tempoinvestidoOnline >= tempoEsperado) {
            return true;
        }else{
            return false;
        }
    }


    /**
     * Retorna uma representação em String do registro de tempo online,
     * contendo o nome da disciplina, o tempo investido e o tempo esperado.
     *
     * @return representação em String do registro de tempo online
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " +
                tempoinvestidoOnline + "/" + tempoEsperado ;
    }

}
