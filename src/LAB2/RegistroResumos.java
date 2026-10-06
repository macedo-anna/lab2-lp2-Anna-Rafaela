package LAB2;

import java.util.Arrays;

public class RegistroResumos {
    private Resumo[] resumo;
    private int qntResumo;
    private int proximoIndice;

    public RegistroResumos(int numeroDeResumos){
        this.proximoIndice = 0;
        this.qntResumo = 0;
        this.resumo = new Resumo[numeroDeResumos];
    }
    public void adiciona(String tema,String conteudo) {

        resumo[proximoIndice] = new Resumo(tema,conteudo);
        proximoIndice++;

        if (proximoIndice == resumo.length) {
            proximoIndice = 0 ;
        }

        if(qntResumo < resumo.length) {
            qntResumo++;
        }

    }
    //vai retornar a quantidade de resumos que ja cadastrados.
    public int conta() {
        return qntResumo;
    }

    //verifica se ja tem resumo com o determinado tema da vez.
    public boolean temResumo(String tema) {
        for (int i = 0; i < qntResumo; i++) {
            if (resumo[i].getTema().equalsIgnoreCase(tema)) {
                return true;

            }
        }

        return false;
    }

    //retorna resumos cadrastrados.

    public String[] pegaResumos() {

        String[] resultado = new String[qntResumo];
        for (int i = 0; i < qntResumo; i++) {
            resultado[i] = resumo[i].toString();

        }

        return resultado;
    }

    //imprime os temas cadrastrados.

    public String imprimeResumos() {

        String resultado = "- " + qntResumo + " resumos(s) cadastrados(n)\n";

        resultado += "- ";

        for (int i = 0;i < qntResumo;i++) {

            resultado += resumo[i].getTema();

            if (i<  qntResumo -1) {
                resultado += " | ";
            }
        }
        return resultado;
    }

    //vai buscar palavras nos conteudos do resumo.

    public String[] busca(String chaveDeBusca) {
        String[] encontrados = new String[qntResumo];
        int contador = 0;

        for(int i = 0;i < qntResumo;i++) {

            String conteudo = resumo[i].getConteudo().toLowerCase();

            String chave = chaveDeBusca.toLowerCase();

            if(conteudo.contains(chave)) {
                encontrados[contador] = resumo[i].getTema();

                contador++;
            }
        }

        String[] resultadoFinal = new String[contador];

        for(int i = 0;i < contador;i++) {
            resultadoFinal[i] = encontrados[i];
        }

        Arrays.sort(resultadoFinal);

        return resultadoFinal;
    }

    public int getQuantidade() {
        return qntResumo;
    }

    public int getProximo() {
        return proximoIndice;
    }
}
