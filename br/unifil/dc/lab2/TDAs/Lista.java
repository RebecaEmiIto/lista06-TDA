package br.unifil.dc.lab2.TDAs;

/**
 * Permite que possa ser pesquisado, retirado, inserido um elemento de uma lista.
 * Veririfica se o elemento existe na lista e returna true ou false.
 *  
 * @param <T>
 */
public interface Lista<T> extends Colecao<T> {
    /**
     * Permite ver o elemento no indice inserido no parâmetro
     * @param indice o indice que deseja ver
     * @return Retorna o indice 
     */
    T acessar(int indice);

    /**
     * Inserir um elemento na lista
     * @param indice A posição que será inserido o valor na lista
     * @param obj O elemento que será inserido na lista
     */
    void inserir(int indice, T obj);

    /**
     * Remove o elemento no indice na posição desejada
     * @param indice A posição que será removida da lista
     * @return O valor removido
     */
    T remover(int indice);

    /**
     * Pesquisa o elemento inserido pelo parâmetro.
     * @param obj O valor a ser pesquisado.
     * @return O indice que foi pesquisado.
     */
    int pesquisar(T obj);

    /**
     * Verfica se o elemento está na lista.
     * @param obj O valor qeu será verificado.
     * @return True, se o valor está presente na lista.
     * False, se o valor não estiver presenter na lista.
     */
    boolean existe(T obj);
}