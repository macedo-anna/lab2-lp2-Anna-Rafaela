package LAB2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    //private double[] valorNota;

    public Disciplina(String nomeDisciplina) {

        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }

    public void cadastraHoras(int horasEstudo){
        this.horasEstudo += horasEstudo;
    }

    public void cadastraNota(int nota,double valorNota){
        notas[nota-1] = valorNota;


    }

    private double media() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double mediaFinal = soma / notas.length;
        return mediaFinal;
    }


    public boolean aprovado(){

        return media()>= 7.0;
    }

    @Override
    public String toString() {
        return  nomeDisciplina  + " " +  horasEstudo + " " +
                media() +" "+ Arrays.toString(notas);
    }
 //"[" + notas[0] + notas[1] + notas[2] + notas[3]+ "]"

}
