package main;

import java.util.List;

public class AlgoritmosBusca {
    
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
