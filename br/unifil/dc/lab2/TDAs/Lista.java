package br.unifil.dc.lab2.TDAs;

/**
 * Permite que possa ser pesquisado, retirado, inserido um elemento de uma lista.
 * Veririfica se o elemento existe na lista e returna true ou false.
 *  
 * @param <T>
 */
public interface Lista<T> extends Colecao<T> {
    T acessar(int indice);
    void inserir(int indice, T obj);
    T remover(int indice);
    int pesquisar(T obj);
    boolean existe(T obj);
}