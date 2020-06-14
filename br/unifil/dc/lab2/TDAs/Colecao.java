package br.unifil.dc.lab2.TDAs;

public interface Colecao<T> {
    /**
     * @return retorna a quantidade de elementos
     */
    int qtdeElems();

    /**
     * @return retorna true se for vazia ou false se não for vazia
     */
    boolean isVazia();
}