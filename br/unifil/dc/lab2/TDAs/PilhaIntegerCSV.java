package br.unifil.dc.lab2.TDAs;

public class PilhaIntegerCSV implements Pilha<Integer> {
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

    @Override
    public int qtdeElems() {
        while(olharTopo() != null){
            totalDeElementos++;
        }
        return totalDeElementos;
    }
    
    @Override
    public boolean isVazia() {
        return false;
    }
    
    @Override
    public void empilhar(Integer obj) {
    }
    
    @Override
    public Integer desempilhar() {
        return null;
    }
    
    @Override
    public Integer olharTopo() {
        return null;
    }
    
    private int totalDeElementos = 0;
}