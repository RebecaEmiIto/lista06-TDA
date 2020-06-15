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
     * 
     * big-o:
     * 1 + n+1 + n-1 + 1 = 2n + 2
     * O(n)
     * 
     * omega:
     * 1 + 1 + 1 = 3
     * Ω(1)
     * 
     */
    public String armazenadorDeValores(){
        StringBuilder line = new StringBuilder();//1
        System.out.println("Fila: ");
        line.append("[ ");
        for(int i = 0; i <= posicaoFila; i++){//n+1
            line.append(fila[i]);
            if(i < posicaoFila){//n-1
                line.append(", ");
            }
        }
        line.append(" ] \n");
        System.out.print(line);
        return line.toString();//1
    }

    /**
     * big-o:
     * 1 + 1 + 1 =3
     * O(1)
     * 
     * omega:
     * 1 + 1 = 2
     * Ω(1)
     * 
     * Θ(1)
     */
    @Override
    public int qtdeElems() {
        if(this.isVazia()){//1
            return 0;//1
        }
        quantidadeElementos = posicaoFila + 1;//1
        return quantidadeElementos;//1
    }

    /**
     * big-o:
     * 1+1 = 2
     * O(1)
     * 
     * omega:
     * 1+1 = 2
     * Ω(1)
     * 
     * Θ(1)
     */
    @Override
    public boolean isVazia() {
        if (posicaoFila == -1){//1
            return true;//1
        }
        return false;//1
    }

    /**
     * big-o:
     * 1+1+1+1+1 = 5
     * O(1)
     * 
     * omega:
     * 1+1+1+1 = 4
     * Ω(1)
     * 
     * Θ(1)
     * 
     */
    @Override
    public void enfileirar(Integer obj) {
        if (posicaoFila == -1) {//1
            this.primeiro = obj;//1
            fila[0] = obj;//1
            posicaoFila++;//1
        }else{
            fila[posicaoFila + 1] = obj;//1
            ultimo = obj;//1
            quantidadeElementos++;//1
            posicaoFila++;//1
        }
        
    }

    /**
     * big-o:
     * 1+1+ n+1 +n+1+1+1+1+1+1+1 = 2n+10
     * O(n)
     * 
     * omega:
     * 1+1+1+1+1+1+1+1+1+1+1 = 11
     * Ω(1)
     * 
     * Θ()
     * 
     * 
     */
    @Override
    public Integer desenfileirar() {
        Integer remove = 0;//1
        Integer prox = 0;//1
        for (int i = 0; i <= posicaoFila; i++) {//n+1
            if (posicaoFila == 0) {//n
                remove = (Integer)fila[0];//1
                prox = (Integer)fila[1];//1
                fila[0] = prox;//1
            }
            prox = (Integer)fila[i+1];//1
            fila[i] = prox;//1
        }
        posicaoFila--;//1
        return remove;//1
    }

    /**
     * big-o:
     * 1+1=2
     * O(1)
     * 
     * omega:
     * 1+1=2
     * Ω(1)
     * 
     * Θ(1)
     * 
     */
    @Override
    public Integer olharPrimeiro() {
        primeiro = (Integer)fila[0];//1
        System.out.println(primeiro);
        return primeiro;//1
    }
    
    
    public Object[] fila;
    public int posicaoFila;
    private int quantidadeElementos;
    private int primeiro;
    private int ultimo;
}