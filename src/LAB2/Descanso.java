package LAB2;
/**
 * Representação do descanso de um estudante.
 * O descanso é determinado a partir da quantidade de horas
 * de descanso e do número de semanas consideradas.
 *
 * @author Anna Rafaela
 */
public class Descanso {
    /**
     * Quantidade de horas de descanso do estudante.
     */
    private int horasDescanso;

    /**
     * Número de semanas consideradas para calcular
     * a média de horas de descanso.
     */
    private int numSemana;


    /**
     * Define a quantidade de horas de descanso do estudante.
     *
     * @param horasDescanso quantidade de horas de descanso
     */
    public void defineHorasDescanso(int horasDescanso){
        this.horasDescanso = horasDescanso;
    }
    /**
     * Define o número de semanas consideradas no cálculo
     * da média de horas de descanso.
     *
     * @param numSemana número de semanas consideradas
     */

    public void defineNumeroSemanas(int numSemana){
        this.numSemana = numSemana;
    }
    /**
     * Retorna o status geral do descanso do estudante.
     * O estudante é considerado cansado quando a média de horas de descanso por
     * semana é menor que 26 horas.
     *
     * @return "CANSADO" caso o estudante esteja cansado ou
     * "DESCANSADO" caso a média de descanso seja suficiente
     */
    public String getStatusGeral(){

        if(numSemana == 0) {
           return "CANSADO"; //o correto não é em caps lock.
        }
        int conta = (horasDescanso / numSemana);
        if(conta < 26){
            return "CANSADO"; //o correto não é em caps lock.
        }else{
            return "DESCANSADO"; //o correto não é em caps lock.
        }
    }


}
