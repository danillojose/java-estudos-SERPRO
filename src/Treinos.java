import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Treinos {
    public static void main(String[] args) {
        int target = 50;
        List<Integer> lista = new ArrayList<>();
        lista.add(50);lista.add(22);lista.add(30);lista.add(5);
        lista.add(10);lista.add(23);lista.add(1);lista.add(9);

        //System.out.println(lista);
        Collections.sort(lista);
        //System.out.println(lista);
        System.out.println(buscaBinaria2(lista, target));
    }

    public static String buscaBinaria2(List list, int target){
        /* Presume que a lista está ordenada */
        int indice_metade = list.size()/2;

        if(list.get(indice_metade).equals(target)){
            return "Achei!";
        }
        else{
            if(target < (int) list.get(indice_metade) && list.size() > 1){
                
                return buscaBinaria2(list.subList(0, indice_metade), target);   //Busca Binária recursiva
            }
            else{
                if(target > (int) list.get(indice_metade) && list.size() > 1){

                    return buscaBinaria2(list.subList(indice_metade, list.size()), target);
                }
                else{
                    
                    return "Número não encontrado.";
                }
            }
        }
    }
}
