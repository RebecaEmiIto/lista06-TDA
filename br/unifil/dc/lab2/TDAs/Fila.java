package br.unifil.dc.lab2.TDAs;

/**
 * Insere um elemento no final da fila
 * Retira o primeiro elemento da fila
 * Mostra o primeiro elemento da fila
 * 
 * @param <T>
 */
public interface Fila<T> extends Colecao<T> {
    void enfileirar(T obj);
    T desenfileirar();
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