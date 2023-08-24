package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.AlgoritmosOrdenacao;

public class AlgoritmosOrdenacaoTest {

    List<Integer> lista = null;
    AlgoritmosOrdenacao alg = new AlgoritmosOrdenacao();

    private void criando_lista(){
        List<Integer> lista = new ArrayList<>();
        lista.add(9);lista.add(22);lista.add(30);lista.add(5);
        lista.add(10);lista.add(23);lista.add(1);lista.add(3);
        this.lista = lista;
    }

    @Test
    public void testando_lista_com_8_elementos(){

        criando_lista();
        assertEquals(8, lista.size());
    }

    @Test
    public void oito_elementos_quicksort(){

        testando_lista_com_8_elementos();
        assertNotNull(alg.quickSort(lista), "A lista enviada foi ordenada pelo método Quicksort.");
    }

    @Test
    public void oito_elementos_heapsort(){

        testando_lista_com_8_elementos();
        assertNotNull(alg.heapSort(lista), "A lista enviada foi ordenada pelo método Heapsort.");
    }

    @Test
    public void testando_lista_null_quicksort(){

        assertNull(alg.quickSort(lista), "A lista enviada ao Quicksort é nula.");
    }

    @Test
    public void testando_lista_null_heapsort(){
        
        assertNull(alg.heapSort(lista), "A lista enviada ao Heapsort é nula.");
    }
}
