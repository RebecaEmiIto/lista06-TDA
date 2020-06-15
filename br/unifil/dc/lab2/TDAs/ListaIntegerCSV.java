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
    public String armazenadorDeValores(){
        System.out.println("Lista: ");
        System.out.print("[ ");
        for(int i = 0; i <= totalDeElementos; i++){
            System.out.print(lista[i]);
            if(i < totalDeElementos){
                System.out.print(", ");
            }
        }
        System.out.print(" ] \n");
        return "lista";
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
        Integer valor = (Integer)lista[indice];
        return valor;
    }

    @Override
    public void inserir(int indice, Integer obj) {
        if (posicaoLista == -1) {
            lista[0] = obj;
            this.primeiro = obj;
            posicaoLista++;
        }else{  
            lista[indice] = obj;
            this.ultimo = obj;
            totalDeElementos++;
            posicaoLista++;  
        }
    }
    
    @Override
    public Integer remover(int indice) {
        Integer remove = 0;
        Integer prox = 0;
        for (int i = 0; i < totalDeElementos; i++) {
            if (indice == i) {
                remove = (Integer)lista[i];
                //lista[i] = null;
                prox = (Integer)lista[i+1];
                lista[i] = prox;
                totalDeElementos--;
            }
        }
        System.out.println("O número removido foi: " + remove);
        return remove;
    }

    @Override
    public int pesquisar(Integer obj) {
        Integer number = 0;
        for (int i = 0; i < lista.length; i++) {
            if (obj.equals(i)) {
                number = i;
            }
        }
        return number;
    }



    @Override
    public boolean existe(Integer obj) {
        boolean achou = false;
        for(int i = 0; i < totalDeElementos; i++){
            if(lista[i] == obj) achou = true;
        }
        return achou;
    }

    public Object[] lista;
    public int posicaoLista;
    private int totalDeElementos;
    private int primeiro;
    private int ultimo;
}