package br.unifil.dc.lab2.TDAs;

/**
 * Permite que possa ser pesquisado, retirado, inserido um elemento de uma lista.
 * Veririfica se o elemento existe na lista e returna true ou false.
 *  
 * @param <T>
 */
public interface Lista<T> extends Colecao<T> {
    /**
     *
     * @param indice
     * @return
     */
    T acessar(int indice);

    /**
     *
     * @param indice
     * @param obj
     */
    void inserir(int indice, T obj);

    /**
     *
     * @param indice
     * @return
     */
    T remover(int indice);

    /**
     *
     * @param obj
     * @return
     */
    int pesquisar(T obj);

    /**
     *
     * @param obj
     * @return
     */
    boolean existe(T obj);
}