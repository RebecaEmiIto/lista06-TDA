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
        if(this.isVazia()){
            return 0;
        }
        return posicaoFila + 1;
    }

    @Override
    public boolean isVazia() {
        if (posicaoFila == -1){
            return true;
        }
        return false;
    }

    @Override
    public void enfileirar(Integer obj) {
        if (posicaoFila == -1) {
            this.primeiro = obj;
            fila[0] = obj;
            posicaoFila++;
        }else{
            for (int i = 0; i < quantidadeElementos; i++) {
                if (quantidadeElementos == i) {
                    fila[i + 1] = obj;
                }
            }
        }
    }

    @Override
    public Integer desenfileirar() {
        Integer remove = 0;
        for (int i = 0; i < quantidadeElementos; i++) {
            if (quantidadeElementos == i) {
                remove = (Integer)fila[i];
                fila[i] = null;
            }
        }
        return remove;
    }
    
    @Override
    public Integer olharPrimeiro() {
        primeiro = (Integer)fila[0];
        return primeiro;
    }
    
    
    public Object[] fila;
    public int posicaoFila;
    private int quantidadeElementos;
    private int primeiro;
    private int ultimo;
}