package main;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    
    private final static int target = 10;

    public static List calcularFibonacci(){
        List<Long> lista = new ArrayList<>();
        lista.add((long) 0);
        lista.add((long) 1);

        for (int n = 2; n < target; n++){
            lista.add((long) lista.get(n-1) + (long) lista.get(n-2));
        }

        return lista;
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci até o termo " + target + ": " + calcularFibonacci());
    }
}
