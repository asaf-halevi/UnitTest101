package org.example.pit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PitCalculatorTest {
    PitCalculator pitCalculator = new PitCalculator();

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "-2, 2, 0",
            "-2, -1, -3",
    })
    void testAdd(int a, int b, int expected) {
        int result = pitCalculator.add(a, b);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, -1",
            "-2, 2, -4",
            "-2, -1, -1",
            "20, 2, 18",
    })
    void testSubtract(int a, int b, int expected) {
        int result = pitCalculator.subtract(a, b);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "4, 2, 2",
            "25, -5, -5",
            "70, 1, 70",
            "5, 2, 2",
    })
    void testDivide(int a, int b, int expected) {
        int result = pitCalculator.divide(a, b);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> pitCalculator.divide(70, 0));
    }

    @ParameterizedTest
    @CsvSource({
            "4, 2, 8",
            "5, -5, -25",
            "-2, -2, 4",
            "8, 0, 0",
    })
    void testMultiply(int a, int b, int expected) {
        int result = pitCalculator.multiply(a, b);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "-2, 2",
    })
    void testAbsolute(int a, int expected) {
        int result = pitCalculator.absolute(a);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testAddAndSave() {
        SomeService someService = new SomeService();
        pitCalculator.addAndSave(10, someService);
        Assertions.assertEquals(10, someService.getSum());
    }
}