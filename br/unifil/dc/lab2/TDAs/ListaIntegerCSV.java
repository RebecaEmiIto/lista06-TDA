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
     * 
     * big-o:
     *1 + n+1 + n-1 + 1 = 2n + 2
     * O(n)
     * 
     * omega:
     * 1 + 1 + 1 = 3
     * Ω(1)
     * 
     */
    public String armazenadorDeValores(){
        StringBuilder list = new StringBuilder();//1
        System.out.println("Lista: ");
        list.append("[ ");
        for(int i = 0; i <= totalDeElementos; i++){//n+1
            list.append(lista[i]);
            if(i < totalDeElementos){//n-1
                list.append(", ");
            }
        }
        list.append(" ] \n");
        System.out.println(list);
        return list.toString();//1
    }

    /**
     * big-o:
     * n+1 + 1 + 1 = n+3
     * O(n)
     * 
     * omega:
     * 1+1 = 2
     * Ω(1)
     * 
     */
    @Override
    public int qtdeElems() {
        while(isVazia() == false){//1
            totalDeElementos++;//1
        }
        return totalDeElementos;//1
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
     * 
     */
    @Override
    public boolean isVazia() {
        if(posicaoLista == -1){//1
            return true;//1
        }
        return false;//1
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
    public Integer acessar(int indice) {
        Integer valor = (Integer)lista[indice];//1
        System.out.println("o numero do indice "+ indice + " é " + valor);
        return valor;//1
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
     */
    @Override
    public void inserir(int indice, Integer obj) {
        if (posicaoLista == -1) {//1
            lista[0] = obj;//1
            this.primeiro = obj;//1
            posicaoLista++;//1
        }else{  
            lista[indice] = obj;//1
            this.ultimo = obj;//1
            totalDeElementos++;//1
            posicaoLista++;  //1
        }
    }
    
    /**
     * big-o:
     * 1+1+ n+1+ n+1 +1+1+1 + n²+ 1+1+1+1= n² + 2n + 11
     * O(n²)
     * 
     * omega:
     * 1+1+1+1+1+1+1+1+1+1 = 10
     * Ω(1)
     * 
     */
    @Override
    public Integer remover(int indice) {
        Integer remove = 0;//1
        Integer prox = 0;//1
        for (int i = 0; i < totalDeElementos; i++) {//n+1
            if (indice == i) {//n+1
                remove = (Integer)lista[i];//1
                prox = (Integer)lista[i+1];//1
                lista[i] = prox;//1
            }
            if(indice < i){//n*n
                prox = (Integer)lista[i+1];//1
                lista[i] = prox;//1
            }
        }
        totalDeElementos--;//1
        System.out.println("O número removido foi: " + remove);
        return remove;//1
    }

    /**
     * big-o:
     * 1+1+ n+1 + 1 + n+1+ n² +1+1 = n² + 2n + 7
     * O(n²)
     * 
     * omega:
     * 1+1+1+1+1+1 = 6
     * Ω(1)
     * 
     * 
     */
    @Override
    public int pesquisar(Integer obj) {
        Integer number = 0;//1
        Integer element = 0;//1
        for (int i = 0; i < lista.length; i++) {//n+1
            element = (Integer)lista[i];//1
            if (obj.equals(element)) {//n*n
                number = i;//1
            }
        }
        System.out.println("O número " + obj + " foi encontrado, ele está no índice " + number );
        return number;//1
    }

    /**
     * big-o:
     * 1+ n+1 +n+1+1 = 2n+4
     * O(n)
     * 
     * omega:
     * 1+1+1+1 = 4
     * Ω(1)
     * 
     */
    @Override
    public boolean existe(Integer obj) {
        boolean achou = false;//1
        for(int i = 0; i < totalDeElementos; i++){//n+1
            if(lista[i] == obj)//n 
            achou = true;//1
        }
        return achou;//1
    }

    public Object[] lista;
    public int posicaoLista;
    private int totalDeElementos;
    private int primeiro;
    private int ultimo;
}