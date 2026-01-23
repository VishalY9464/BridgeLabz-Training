package com.junittesting.calculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(6, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(6, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(24, calculator.multiply(6, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(8, 4));
    }

    // ✅ BONUS: Division by Zero Test
    @Test
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
