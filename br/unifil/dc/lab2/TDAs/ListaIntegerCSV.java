package br.unifil.dc.lab2.TDAs;

public class ListaIntegerCSV implements Lista<Integer>{

    /**
     * Construtor
     */
    public ListaIntegerCSV(){
        this.primeiro = primeiro;
        this.ultimo = ultimo;
        this.posicaoLista = -1;
        this.lista = new Object[1000];
    }

    /**
     * 
     * @return -> Retorna uma string da lista, separada por vírgulas
     *            Exemplo: [ 1, 2, 3, 4 ]
     */
    public String armazenadorDeValores(int indice, Integer obj){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Lista: ");
        System.out.print("[ ");
        while(!isVazia()){
            System.out.println(inserir(indice, obj));
            
        }
        System.out.print(" ]");
        return stringBuilder.toString();
    }

    @Override
    public int qtdeElems() {
        while(isVazia() == false){
            totalDeElementos++;
        }
        return totalDeElementos;
    }

    @Override
    public boolean isVazia() {
        if(posicaoLista == -1){
            return true;    
        }
        return false;
    }

    @Override
    public Integer acessar(int indice) {
        return null;
    }

    @Override
    public void inserir(int indice, Integer obj) {
        if (posicaoLista == -1) {
            this.ultimo = obj;
            this.primeiro = obj;
        }else{
            for(int i = 0; i < totalDeElementos; i++){
                posicaoLista++;
            }
        }
    }

    @Override
    public Integer remover(int indice) {
        return null;
    }

    @Override
    public int pesquisar(Integer obj) {
        return 0;
    }

    @Override
    public boolean existe(Integer obj) {
        return false;
    }

    public Object[] lista;
    public int posicaoLista;
    private int totalDeElementos;
    private int primeiro;
    private int ultimo;
}