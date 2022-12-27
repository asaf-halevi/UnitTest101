package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PitFallTest {

    private final PitFall pitFall = new PitFall();

    @Test
    public void testDivideByNumber() {
        final int actual = pitFall.divide(1, 1);

        assertEquals(1, actual);
    }

    @Test
    public void testDivideByZero() {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            pitFall.divide(4, 0);
        });

        Assertions.assertEquals("/ by zero", thrown.getMessage());
    }
}
