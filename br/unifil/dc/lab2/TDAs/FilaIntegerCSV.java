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
        StringBuilder line = new StringBuilder();
        System.out.println("Fila: ");
        line.append("[ ");
        for(int i = 0; i <= posicaoFila; i++){
            line.append(fila[i]);
            if(i < posicaoFila){
                line.append(", ");
            }
        }
        line.append(" ] \n");
        System.out.print(line);
        return line.toString();
    }

    @Override
    public int qtdeElems() {
        if(this.isVazia()){
            return 0;
        }
        quantidadeElementos = posicaoFila + 1;
        return quantidadeElementos;
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
            fila[posicaoFila + 1] = obj;
            ultimo = obj;
            quantidadeElementos++;
            posicaoFila++;  
        }
        
    }

    @Override
    public Integer desenfileirar() {
        Integer remove = 0;
        Integer prox = 0;
        for (int i = 0; i <= posicaoFila; i++) {
            if (posicaoFila == 0) {
                remove = (Integer)fila[0];
                prox = (Integer)fila[1];
                fila[0] = prox;
            }
            prox = (Integer)fila[i+1];
            fila[i] = prox;
        }
        posicaoFila--;
        return remove;
    }

    @Override
    public Integer olharPrimeiro() {
        primeiro = (Integer)fila[0];
        System.out.println(primeiro);
        return primeiro;
    }
    
    
    public Object[] fila;
    public int posicaoFila;
    private int quantidadeElementos;
    private int primeiro;
    private int ultimo;
}