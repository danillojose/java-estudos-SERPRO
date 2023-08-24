package main;
import java.util.Collections;
import java.util.List;

public class AlgoritmosOrdenacao {
    /* public static void main(String[] args) {
        
        int target = 30;
        List<Integer> lista = new ArrayList<>();
        lista.add(9);lista.add(22);lista.add(30);lista.add(5);
        lista.add(10);lista.add(23);lista.add(1);lista.add(3);

        System.out.println("Lista: \t\t" + lista);
        //Collections.sort(lista);
        //quickSort(lista);
        heapSort(lista);
        System.out.println("Lista ordenada: " + lista);
        System.out.println(buscaBinaria(lista, target));
    } */

    public List heapSort(List lista){
        /* Presume-se que a árvore é binária. */
        
        if(lista != null && lista.size() > 1){
            for(int pai = 0; pai < lista.size(); pai++){
                int filho1 = pai*2 + 1; //filho da esquerda
                int filho2 = pai*2 + 2; //filho da direita
                int maior_filho = 0;

                if(filho2 < lista.size() && (int) lista.get(filho2) > (int) lista.get(filho1)){
                    maior_filho = filho2;
                }
                else {
                    if(filho1 < lista.size()){
                        maior_filho = filho1;
                    }
                }
                if(maior_filho != 0 && (int) lista.get(pai) < (int) lista.get(maior_filho)){
                    Collections.swap(lista, pai, maior_filho);
                }
            }

            //System.out.println("Heap máxima: \t" + lista);
            Collections.swap(lista, 0, lista.size()-1);
            heapSort(lista.subList(0, lista.size()-1));
            
            return lista;

        }
        
        return null;

    }

    public List quickSort(List lista){
        
        //System.out.println(lista);
        if(lista != null && lista.size() > 1){
            int pivot = (int) lista.get(0);
            //System.out.println("Pivot: " + pivot);

            int j=1;
            
            for(int i=1; i < lista.size(); i++){
                if((int) lista.get(i) <= pivot){
                    Collections.swap(lista, i, j);
                    j++;
                }
            }
            
            Collections.swap(lista, 0, j-1);
            //System.out.println(lista);

            //System.out.println("(" + 0 + " > " + (j-1) + ") e (" + j + " > " + (lista.size()) + ")");
            quickSort(lista.subList(0, j-1));   //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
            quickSort(lista.subList(j, lista.size()));
            
            return lista;
            
        }

        return null;
        
    }

}
