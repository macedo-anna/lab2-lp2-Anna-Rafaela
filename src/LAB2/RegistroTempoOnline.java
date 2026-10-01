package LAB2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(int tempoEsperado,String nomeDisciplina) {
        this.tempoEsperado = tempoEsperado;
        this.nomeDisciplina = nomeDisciplina;
    }

    public void adicionaTempoOnline(int tempoInvestidoOnline){


    }

    public boolean atingiuMetaTempoOnline(){
        return true;
    }

    public double verificaTempoOnline(){
        return 2.0;
    }

    @Override
    public String toString() {
        return "RegistroTempoOnline{" +
                "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", tempoInvestidoOnline=" + tempoInvestidoOnline +
                ", tempoEsperado=" + tempoEsperado +
                '}';
    }
}
