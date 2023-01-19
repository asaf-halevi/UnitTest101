package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("Should return the sum of a and b plus 1")
    void wrongAddShouldReturnTheSumOfAAndBPlus1() {
        Calculator calculator = new Calculator();

        int result = calculator.wrongAdd(1, 2);

        assertEquals(4, result);
    }

    @Test
    @DisplayName("Should return the sum of a and b")
    void aWhenReturnSumOfAAndB() {
        Calculator calculator = new Calculator();

        int result = calculator.add(1, 2);

        assertEquals(3, result);
    }
}