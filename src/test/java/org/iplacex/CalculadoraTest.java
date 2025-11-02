package org.iplacex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private final Calculadora calculator = new Calculadora();

    @Test
    void testSumar() {
        assertEquals(5, calculator.sumar(2, 3), "2 + 3 debe ser 5");
    }

    @Test
    void testRestar() {
        assertEquals(1, calculator.restar(4, 3), "4 - 3 debe ser 1");
    }
}
