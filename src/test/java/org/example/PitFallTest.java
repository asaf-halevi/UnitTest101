package org.example;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PitFallTest {

    private final PitFall pitFall = new PitFall();

    @Test
    void divideTestDivideByNumber() {
        final int actual = pitFall.divide(1, 1);

        assertEquals(2, actual);
    }

    @Test
    @Ignore
    void divideTestDivideByZero() {
        ArithmeticException thrown = Assertions.assertThrows
                                                       (ArithmeticException.class, () -> {
                                                           pitFall.divide(4, 0);
                                                       });

        Assertions.assertEquals("/ by zero", thrown.getMessage());
    }
}
