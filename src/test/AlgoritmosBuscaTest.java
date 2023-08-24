package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.AlgoritmosBusca;
import main.AlgoritmosOrdenacao;

public class AlgoritmosBuscaTest {
    
    AlgoritmosBusca alg_Busca = new AlgoritmosBusca();
    AlgoritmosOrdenacao alg_Ordenacao = new AlgoritmosOrdenacao();
    List lista;
    int target;

    public void setTarget(int target) {
        this.target = target;
    }

    @BeforeEach
    private void criando_lista(){
        List<Integer> lista = new ArrayList<>();
        lista.add(9);lista.add(22);lista.add(30);lista.add(5);
        lista.add(10);lista.add(23);lista.add(1);lista.add(3);
        this.lista = lista;
    }

    @Test
    public void testando_busca_binaria_com_ordenacao_quicksort(){

        setTarget(30);
        System.out.println("Lista: \t\t" + lista);
        alg_Ordenacao.quickSort(lista);
        System.out.println("Lista ordenada: " + lista);
        assertEquals("Achei!", alg_Busca.buscaBinaria(lista, target), "A Busca binária com ordenação quicksort funcionou!");
    }

    @Test
    public void testando_busca_binaria_com_ordenacao_heapsort(){

        setTarget(30);
        System.out.println("Lista: \t\t" + lista);
        alg_Ordenacao.heapSort(lista);
        System.out.println("Lista ordenada: " + lista);
        assertEquals("Achei!", alg_Busca.buscaBinaria(lista, target), "A Busca binária com ordenação heapsort funcionou!");
    }

    @Test
    public void testando_busca_binaria_sem_ordenacao(){

        setTarget(30);
        System.out.println("Lista: \t\t" + lista);
        assertEquals("Número não encontrado.", alg_Busca.buscaBinaria(lista, target), "A Busca binária sem ordenação não deve funcionar!");
    }

    @Test
    public void testando_busca_binaria_com_target_vazio(){

        alg_Ordenacao.heapSort(lista);
        System.out.println("Target: " + target);
        assertEquals("Número não encontrado.", alg_Busca.buscaBinaria(lista, target), "O target vazio deve gerar uma busca binária de target = 0.");
    }
}
