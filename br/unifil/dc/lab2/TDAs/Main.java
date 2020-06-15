package br.unifil.dc.lab2.TDAs;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaIntegerCSV lista = new ListaIntegerCSV();
        PilhaIntegerCSV pilha = new PilhaIntegerCSV();
        FilaIntegerCSV fila = new FilaIntegerCSV();
        int num = 0;
        int subNum = 0;
        int indice = 0;
        Integer obj = 0;
        boolean x = true;
        boolean subX = true;
        while(x == true){
            System.out.println(" 1 - Lista \n 2 - Pilha \n 3 - Fila \n 4 - Sair");
            num = scan.nextInt();
            switch(num){
                case 1: System.out.println("Você escolheu Lista");
                    x = true;
                    subX = true;
                    while(subX == true){
                        System.out.println(" --Lista-- \n 1 - Add elemento \n 2 - Remover elemento \n 3 - Mostrar (armazenador) \n 4 - sair");
                        subNum = scan.nextInt();
                        switch(subNum){
                            case 1: System.out.println("Add elemento na lista");
                                    subX = true;
                                    System.out.println("insira um valor para a posiçao da lista");
                                    indice = scan.nextInt();
                                    System.out.println("incira um valor");
                                    obj = scan.nextInt();
                                    lista.inserir(indice, obj);
                            break;
                            
                            case 2: System.out.println("Remove elemento da lista");
                                    subX = true;
                                    indice = scan.nextInt();
                                    lista.remover(indice);
                            break;

                            case 3: System.out.println("Mostrar elemento da lista");
                                    subX = true;
                                    lista.armazenadorDeValores();
                            break;
                            
                            case 4: System.out.println("saida");
                                    subX = false;
                            break;
                        }          
                    }
                break;
                
                case 2: System.out.println("Você escolheu Pilha");
                        x = true;
                        subX = true;
                        while(subX == true){
                            System.out.println(" --Pilha-- \n 1 - Add elemento \n 2 - Remover elemento \n 3 - Mostrar (armazenador) \n 4 - sair");
                            subNum = scan.nextInt();
                            switch(subNum){
                                case 1: System.out.println("Add elemento na Pilha");
                                        subX = true;
                                        System.out.println("Insira o índice onde o elemento sera inserido na Pilha");
                                        indice = scan.nextInt();
                                        System.out.println("Insira o número que sera inserido na Pilha");
                                        obj = scan.nextInt();
                                        pilha.empilhar(obj);
                                break;
                                
                                case 2: System.out.println("Remove elemento da Pilha");
                                        subX = true;
                                        System.out.println("Remove elemento da Pilha");
                                        indice = scan.nextInt();
                                        pilha.desempilhar();
                                break;

                                case 3: System.out.println("Mostra os elemento da Pilha");
                                        subX = true;
                                        pilha.armazenadorDeValores();
                                break;

                                case 4: System.out.println("saida");
                                        subX = false;
                                break;
                            }          
                        }
                break;
                
                case 3: System.out.println("Você escolheu Fila");
                        x = true;
                        subX = true;
                        while(subX == true){
                            System.out.println(" --Fila-- \n 1 - Add elemento \n 2 - Remover elemento \n 3 - Mostrar (armazenador) \n 4 - sair");
                            subNum = scan.nextInt();
                            switch(subNum){
                                case 1: System.out.println("Add elemento na Fila");
                                        subX = true;
                                        System.out.println("Insira o índice onde o elemento sera inserido na Fila");
                                        indice = scan.nextInt();
                                        System.out.println("Insira o número que sera inserido na Fila");
                                        obj = scan.nextInt();
                                        fila.enfileirar(obj);
                                break;
                                
                                case 2: System.out.println("Desnfileira elemento da Fila");
                                        subX = true;
                                        indice = scan.nextInt();
                                        fila.desenfileirar();
                                break;

                                case 3: System.out.println("Mostra os elemento da Fila");
                                        subX = true;
                                        fila.armazenadorDeValores();
                                break;
                                
                                case 4: System.out.println("saida");
                                        subX = false;
                                break;
                            }          
                        }
                break;
                
                case 4: System.out.println("saida");
                    x = false;
                break;
            }
        }
    }
}
// \n 4 - Add elemento \n 5 - Remover elemento 