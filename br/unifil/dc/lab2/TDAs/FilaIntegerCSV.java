package br.unifil.dc.lab2.TDAs;

public class FilaIntegerCSV implements Fila<Integer>{
      /**
     * Construtor
     */
    public FilaIntegerCSV(){
        this.primeiro = primeiro;
        this.ultimo = ultimo;
        this.posicaoFila = -1;
        this.fila = new Object[1000];
    }
    /**
     * 
     * @return -> Retorna uma string da fila, separada por vírgulas
     *            Exemplo: [ 1, 2, 3, 4 ]
     */
    public String armazenadorDeValores(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        while(!isVazia()){
            stringBuilder.append(olharPrimeiro() + ", ");
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    @Override
    public int qtdeElems() {
        return quantidadeElementos;
    }

    @Override
    public boolean isVazia() {
        return false;
    }

    @Override
    public void enfileirar(Integer obj) {
        
    }

    @Override
    public Integer desenfileirar() {
        return null;
    }
    
    @Override
    public Integer olharPrimeiro() {
        return primeiro;
    }
    
    
    public Object[] fila;
    public int posicaoFila;
    private int quantidadeElementos;
    private int primeiro;
    private int ultimo;
}