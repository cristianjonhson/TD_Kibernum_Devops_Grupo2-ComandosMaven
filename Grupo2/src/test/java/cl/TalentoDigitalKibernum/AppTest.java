package cl.TalentoDigitalKibernum;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 20);
        assertEquals(30, result);
        assertNotEquals(90, result);
    }

    @Test
    public void testSubstraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(20, 10);
        assertEquals(10, result);
    }

    @Test
    public void testSumWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    public void testSubtractToNegativeResult() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    public void testSumWithZero() {
        // Verifica que la suma de 0 y 5 sea 5
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(0, 5));
    }

    @Test
    public void testSumTrueCondition() {
        // Verifica que la suma de 2 y 3 sea mayor que 4
        Calculator calculator = new Calculator();
        assertTrue(calculator.add(2, 3) > 4);
    }

    @Test
    public void testSumFalseCondition() {
        // Verifica que la suma de 2 y 3 no sea menor que 4
        Calculator calculator = new Calculator();
        assertFalse(calculator.add(2, 3) < 4);
    }

    @Test
    public void testCalculatorNotNull() {
        // Verifica que la instancia del calculator no sea nula
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    public void testCalculatorNullAfterTearDown() {
        //tearDown(); // Llamada manual para demostrar
        Calculator calculator = new Calculator();
        assertNull(calculator);
    }

    @Test
    public void testSumSameObjectReference() {
        Calculator calculator = new Calculator();
        Calculator anotherCalculator = calculator;
        // Verifica que dos referencias apuntan al mismo objeto
        assertSame(calculator, anotherCalculator);
    }

    @Test
    public void testSumNotSameObjectReference() {
        Calculator calculator = new Calculator();
        Calculator anotherCalculator = new Calculator();
        // Verifica que dos referencias no apuntan al mismo objeto
        assertNotSame(calculator, anotherCalculator);
    }

    @Test
    public void testSumFailure() {
        // Este test está diseñado para fallar
        fail("This test is designed to fail.");
    }
}
