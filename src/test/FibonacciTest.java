package test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import main.Fibonacci;

public class FibonacciTest {

    @Test
    public void testar_fibonacci_nao_nulo(){
        assertNotNull(Fibonacci.calcularFibonacci(), "Método Fibonacci retornando lista não nula.");
        
    }

}
