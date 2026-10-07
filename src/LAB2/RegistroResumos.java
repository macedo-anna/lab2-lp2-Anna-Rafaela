package LAB2;

import java.sql.Array;
import java.util.Arrays;

/**
 * Representação de um registro de resumos de estudo.
 * O registro armazena uma quantidade limitada de resumos e permite
 * adicionar, consultar, buscar e obter informações sobre os resumos
 * cadastrados.
 *
 * @author Anna Rafaela
 */

public class RegistroResumos {

    /**
     * Array responsável por armazenar os resumos cadastrados.
     */
    private Resumo[] resumo;


    /**
     * Quantidade de resumos atualmente cadastrados no registro.
     */
    private int qntResumo;


    /**
     * Índice da próxima posição disponível para cadastrar um resumo.
     */
    private int proximoIndice;



    /**
     * Constrói um registro de resumos com uma quantidade máxima
     * de resumos definida.
     *
     * @param numeroDeResumos quantidade máxima de resumos que poderão
     * ser armazenados no registro
     */
    public RegistroResumos(int numeroDeResumos){
        this.proximoIndice = 0;
        this.qntResumo = 0;
        this.resumo = new Resumo[numeroDeResumos];
    }


    /**
     * Adiciona um novo resumo ao registro.
     * Quando o final do array é alcançado, o próximo resumo
     * volta a ser armazenado a partir da primeira posição.
     *
     * @param tema tema do resumo
     * @param conteudo conteúdo do resumo
     */
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


    /**
     * Retorna a quantidade de resumos atualmente cadastrados.
     *
     * @return quantidade de resumos cadastrados
     */
    public int conta() {
        return qntResumo;
    }



    /**
     * Verifica se existe um resumo cadastrado com o tema informado.
     * A comparação entre os temas não diferencia letras maiúsculas
     * de letras minúsculas.
     *
     * @param tema tema que será procurado entre os resumos cadastrados
     * @return true se existir um resumo com o tema informado ou
     * false caso contrário
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < qntResumo; i++) {
            if (resumo[i].getTema().equalsIgnoreCase(tema)) {
                return true;

            }
        }

        return false;
    }




    /**
     * Retorna os resumos atualmente cadastrados em um array de Strings.
     * Cada posição do array contém a representação em String de um resumo.
     *
     * @return array contendo os resumos cadastrados
     */
    public String[] pegaResumos() {

        String[] resultado = new String[qntResumo];
        for (int i = 0; i < qntResumo; i++) {
            resultado[i] = resumo[i].toString();

        }

        return resultado;
    }



    /**
     * Retorna uma String contendo a quantidade de resumos cadastrados
     *
     * @return String contendo a quantidade e os temas dos resumos cadastrados
     */
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


    public String[] busca(String chaveDeBusca){

        String[] resposta = new String[resumo.length];
        int indeceAtual = 0;
        for (int i = 0;i < qntResumo;i++){
            String conteudoAvaliado = resumo[i].getConteudo();
            if(conteudoAvaliado.contains(chaveDeBusca)){
                 resposta[indeceAtual] = resumo[i].getTema();
                 indeceAtual ++;
            }else{
                resposta[i] = "não encontrado";
            }
        }
        return resposta;
        }



    /**
     * Busca uma palavras dentro dos conteúdos dos resumos.
     * A busca não diferencia letras maiúsculas de letras minúsculas.
     * Os temas dos resumos encontrados são retornados em ordem alfabética.
     *
     * @param chaveDeBusca palavra que será procurada
     * nos conteúdos dos resumos
     * @return array contendo os temas dos resumos que possuem
     * a chave de busca
     */
   /* public String[] busca(String chaveDeBusca) {
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
    }/*

    /**
     * Retorna a quantidade de resumos atualmente cadastrados.
     *
     * @return quantidade de resumos cadastrados
     */
    public int getQuantidade() {
        return qntResumo;
    }

    /**
     * Retorna o índice que será utilizado para o próximo resumo
     * a ser cadastrado.
     *
     * @return índice da próxima posição de cadastro
     */
    public int getProximo() {
        return proximoIndice;
    }
}
