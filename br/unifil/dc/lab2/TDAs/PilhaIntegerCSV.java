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
            this.topo = obj;
        }else{
            posicaoPilha++;
        }
    }
    /*
    public void adicionar(int _valor) {
        Node _node = new Node(_valor);
        if (this.inicio == null) {
            this.inicio = _node;
        } else {
            Node aux = this.inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(_node);
            _node.setAnterior(aux);
        }
        tamanho++;
    }
    */
    
    @Override
    public Integer desempilhar() {
        if (isVazia()){
            return null;
        }
        return topo;
    }
    
    /*
    public void remover(int _valor) {
        Node aux = this.inicio;
        Node anterior = null;
        while (aux.getProximo() != null && aux.getValor() != _valor) {
            anterior = aux;
            aux = aux.getProximo();
        }
        aux.getProximo().setAnterior(anterior);
        anterior.setProximo(aux.getProximo());
        this.tamanho--;
    }
    */
    
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