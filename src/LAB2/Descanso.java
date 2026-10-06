package LAB2;

public class Descanso {
    private int horasDescanso;
    private int numSemana;



    public void defineHorasDescanso(int horasDescanso){
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numSemana){
        this.numSemana = numSemana;
    }

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
