import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Treinos {
    public static void main(String[] args) {
        int target = 30;
        List<Integer> lista = new ArrayList<>();
        lista.add(9);lista.add(22);lista.add(30);lista.add(5);
        lista.add(10);lista.add(23);lista.add(1);lista.add(3);

        System.out.println("Lista: \t\t" + lista);
        //Collections.sort(lista);
        quickSort(lista);
        System.out.println("Lista ordenada: " + lista);
        System.out.println(buscaBinaria(lista, target));
    }

    public static void quickSort(List lista){
        
        //System.out.println(lista);
        if(lista.size() > 1){
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
            
        }
        
    }

    public static String buscaBinaria(List list, int target){
        /* Presume que a lista está ordenada */
        int indice_metade = list.size()/2;

        if(list.get(indice_metade).equals(target)){
            return "Achei!";
        }
        else{
            if(target < (int) list.get(indice_metade) && list.size() > 1){
                
                return buscaBinaria(list.subList(0, indice_metade), target);   //Busca Binária recursiva
            }
            else{
                if(target > (int) list.get(indice_metade) && list.size() > 1){

                    return buscaBinaria(list.subList(indice_metade, list.size()), target);
                }
                else{
                    
                    return "Número não encontrado.";
                }
            }
        }
    }
}
