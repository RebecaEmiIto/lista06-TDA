package br.unifil.dc.lab2.TDAs;

/**
 * Insere um elemento no final da fila
 * Retira o primeiro elemento da fila
 * Mostra o primeiro elemento da fila
 * 
 * @param <T>
 */
public interface Fila<T> extends Colecao<T> {
  /**
   * Adiciona os elementos na fila.
   * @param obj Objeto que será adicionado na fila.
   */
    void enfileirar(T obj);
    /**
     * Remove o primeiro elemento da fila.
     * @return O elemento removido.
     */
    T desenfileirar();
    /**
     * Verifica qual elemento está na primeira posição.
     * @return O elemento que está contido na primeira posição.
     */
    T olharPrimeiro();
}
/*
valor a ser
retirado                           Insere um novo
e/ou olhada                            valor
  V                                      V
 ___________________________________________
|___|___|___|___|___|___|___|___|___|___|___|
*/