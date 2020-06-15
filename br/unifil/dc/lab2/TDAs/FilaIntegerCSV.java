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
        System.out.println("Lista: ");
        line.append("[ ");
        for(int i = 0; i <= quantidadeElementos; i++){
            line.append(fila[i]);
            if(i < quantidadeElementos){
                line.append(", ");
            }
        }
        line.append(" ] \n");
        System.out.print(line);
        return "lista";
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
            for (int i = 0; i <= quantidadeElementos; i++) {
                if (quantidadeElementos == i) {
                    fila[i + 1] = obj;
                    ultimo = obj;
                }
                quantidadeElementos++;
                posicaoFila++;  
            }
        }
    }

    @Override
    public Integer desenfileirar() {
        Integer remove = 0;
        Integer prox = 0;
        for (int i = 0; i <= quantidadeElementos; i++) {
            if (quantidadeElementos == i) {
                remove = (Integer)fila[i];
                prox = (Integer)fila[i+1];
                fila[i] = prox;
                quantidadeElementos--;
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