package LAB2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoinvestidoOnline;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {

        this.nomeDisciplina = nomeDisciplina;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.tempoEsperado = tempoEsperado;
        this.nomeDisciplina = nomeDisciplina;
    }

    public void adicionaTempoOnline(int tempoinvestidoOnline) {
        this.tempoinvestidoOnline += tempoinvestidoOnline;

    }

    public boolean atingiuMetaTempoOnline() {
        if (tempoinvestidoOnline >= tempoEsperado) {
            return true;
        }else{
            return false;
        }
    }


    @Override
    public String toString() {
        return nomeDisciplina + " " +
                tempoinvestidoOnline + "/" + tempoEsperado ;
    }

}
