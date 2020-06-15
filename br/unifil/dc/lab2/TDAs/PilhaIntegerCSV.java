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
     * 
     * big-o:
     * 1 + n+1 + n-1 + 1 = 2n + 2
     * O(n)
     * 
     * omega:
     * 1 + 1 + 1 = 3
     * Ω(1)
     */
    public String armazenadorDeValores(){
        StringBuilder pile = new StringBuilder();//1
        System.out.println("Pilha: ");
        pile.append("[ ");
        for(int i = 0; i <= posicaoPilha; i++){//1
            pile.append(pilha[i]);
            if(i < posicaoPilha){
                pile.append(", ");
            }
        }
        pile.append(" ] \n");
        System.out.println(pile);
        return pile.toString();//1
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
        if (this.isVazia()){//1
            return 0;//1
        }        
        totalDeElementos = posicaoPilha + 1; //1
        return totalDeElementos;//1
    }

    /**
     *big-o:
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
        if (posicaoPilha == -1){//1
            return true;//1
        }
        return false;//1
    }

    /**
     *big-o:
     * 1+1+1+1 = 4
     * O(1)
     * 
     * omega:
     * 1+1+1+1 = 4
     * Ω(1)
     * 
     * Θ(1)
     */
    @Override
    public void empilhar(Integer obj) {
        if (posicaoPilha == -1) {//1
            this.ultimo = obj;//1
            pilha[0] = obj;//1
            posicaoPilha++;//1
        }else{
            pilha[posicaoPilha + 1] = obj;//1
            this.topo = obj;//1
            posicaoPilha++;//1
        }
    
    }

    /**
     * big-o:
     * 1+1+1+1+1+1+1+ n+1 + n+1 = 2n + 9
     * O(n)
     * 
     * omega:
     * 1+1+1+1 = 4
     * Ω(1)
     */
    public Integer desempilhar() {
        Integer remove = 0;//1
        Integer prox = 0;//1
        if (isVazia()){//1
            return null;
        }else{
            for (int i = 0; i <= posicaoPilha; i++) {//n+1
                if (posicaoPilha == i) {//n+1
                    remove = (Integer)pilha[i];//1
                    prox = (Integer)pilha[i+1];//1
                    pilha[i] = prox;//1
                    posicaoPilha--;//1
                }
            }
        }
        return remove;//1
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
    public Integer olharTopo() {
        if(this.isVazia()){//1
            return null;//1
        }
        System.out.println("O elemento do topo da pilha é: " + topo);
        return topo;//1
    }

    private int totalDeElementos;
    private int topo;
    private int ultimo;
    public Object[] pilha;
    public int posicaoPilha;
}