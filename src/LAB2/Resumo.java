package LAB2;

/**
 * Representação de um resumo de estudo.
 * Um resumo possui um tema e um conteúdo relacionado a esse tema.
 *
 * @author Anna Rafaela
 */
public class Resumo {

    /**
     * Tema abordado no resumo.
     */
    private String tema;

    /**
     * Conteúdo do resumo relacionado ao tema.
     */
    private String conteudo;


    /**
     * Constrói um resumo a partir de seu tema e conteúdo.
     *
     * @param tema tema abordado no resumo
     * @param conteudo conteúdo relacionado ao tema
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return tema do resumo
     */
    public String getTema() {

        return tema;
    }


    /**
     * Retorna o conteúdo do resumo.
     *
     * @return conteúdo do resumo
     */
    public String getConteudo() {

        return conteudo;
    }


    /**
     * Retorna uma representação em String do resumo,
     * contendo o tema e o conteúdo.
     *
     * @return representação em String do resumo
     */
    @Override
    public String toString() {

        return  tema + " " + conteudo;
    }
}
