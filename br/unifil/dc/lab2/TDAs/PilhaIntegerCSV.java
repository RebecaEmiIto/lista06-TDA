package br.unifil.dc.lab2.TDAs;

public class PilhaIntegerCSV implements Pilha<Integer> {

    /**
     * Construtor
     */
    public PilhaIntegerCSV(){
        this.posicaoPilha = -1;
        this.pilha = new Object[1000];
    }

    /**
     * 
     * @return -> Retorna uma string da pilha, separada por vírgulas
     *            Exemplo: [ 1, 2, 3, 4 ]
     */
    public String armazenadorDeValores(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        while(!isVazia()){
            stringBuilder.append(olharTopo() + ", ");
        }
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }

    //qtdeElems == tamanho (ñ esta atribuindo)
    @Override
    public int qtdeElems() {
        while(olharTopo() != null){
            totalDeElementos++;
        }
        return totalDeElementos;
    }
    
    @Override
    public boolean isVazia() {
        if (posicaoPilha == -1){
            return true;
        }
        return false;
    }

    @Override
    public void empilhar(Integer obj) {
        if (posicaoPilha == -1) {
            this.ultimo = obj;
        }else{
            for (int i = 0; i <= totalDeElementos; i++) {
                if (totalDeElementos == i) {
                    pilha[i + 1] = obj;
                    this.topo = obj;
                }
            }
        }
    }

    @Override
    public Integer desempilhar() {
        Integer remove = 0;
        if (isVazia()){
            return null;
        }else{
            for (int i = 0; i <= totalDeElementos; i++) {
                if (totalDeElementos == i) {
                    remove = (Integer)pilha[i];
                    pilha[i] = null;
                }
            }
        }
        return remove;
    }

    @Override
    public Integer olharTopo() {
        if(this.isVazia()){
            return null;
        }
        return topo;
    }
    
    private int totalDeElementos;
    private int topo;
    private int ultimo;
    public Object[] pilha;
    public int posicaoPilha;
}