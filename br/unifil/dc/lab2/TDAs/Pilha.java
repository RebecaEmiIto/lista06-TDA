package br.unifil.dc.lab2.TDAs;

public interface Pilha<T> extends Colecao<T> {
    /**
     * Acrescenta um elemento no topo da pilha
     * 
     * @param obj
     */
    void empilhar(T obj);

    /**
     * Retira o elemento que está no topo da pilha
     * 
     * @return
     */
    T desempilhar();

    /**
     * Mostra o valor que está no topo da lista
     * 
     * @return
     */
    T olharTopo();
}
/*
 _______
|__topo__| <- elemento a ser retirado
|________|    inserido e olhado
|________|
|________|
|________|
|________|
|________|
|________|
*/