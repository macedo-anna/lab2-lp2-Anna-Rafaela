package LAB2;

public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private int notas;
    private double valorNota;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastrarHoras(int horasEstudo){

    }

    public void cadastrarNota(int notas,double valorNota){

    }

    public double calculaMedia(){
        return 10.0;
    }

    public boolean aprovado(){
        return false;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", horasEstudo=" + horasEstudo +
                ", notas=" + notas +
                ", valorNota=" + valorNota +
                '}';
    }
}
