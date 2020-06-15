package br.unifil.dc.lab2.TDAs;

public class PilhaIntegerCSV implements Pilha<Integer> {
    /**
     * Construtor
     */
    public PilhaIntegerCSV(){
        this.topo = topo;
        this.ultimo = ultimo;
        this.posicaoPilha = -1;
        this.pilha = new Object[1000];
    }

    /**
     *
     * @return -> Retorna uma string da pilha, separada por vírgulas
     *            Exemplo: [ 1, 2, 3, 4 ]
     */
    public String armazenadorDeValores(){
        StringBuilder pile = new StringBuilder();
        System.out.println("Pilha: ");
        pile.append("[ ");
        for(int i = 0; i <= posicaoPilha; i++){
            pile.append(pilha[i]);
            if(i < posicaoPilha){
                pile.append(", ");
            }
        }
        pile.append(" ] \n");
        System.out.println(pile);
        return pile.toString();
    }

    //qtdeElems é igual a tamanho
    @Override
    public int qtdeElems() {
//        while(olharTopo() != null){
//            totalDeElementos++;
//        }
//        return totalDeElementos;
        if (this.isVazia()){
            return 0;
        }        
        totalDeElementos = posicaoPilha + 1;
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
            //this.topo = obj;
            pilha[0] = obj;
            posicaoPilha++;
            //qtdeElems();
        }else{

            pilha[posicaoPilha + 1] = obj;
            this.topo = obj;
            posicaoPilha++;
            //qtdeElems();
        }
    
    }
    public Integer desempilhar() {
        Integer remove = 0;
        Integer prox = 0;
        if (isVazia()){
            return null;
        }else{
            for (int i = 0; i <= posicaoPilha; i++) {
                if (posicaoPilha == i) {
                    remove = (Integer)pilha[i];
                    prox = (Integer)pilha[i+1];
                    pilha[i] = prox;
                    posicaoPilha--;
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