package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PitFallTest {

    private final PitFall pitFall = new PitFall();

    @Test
    public void divideTestDivideByNumber() {
        final int actual = pitFall.divide(1, 1);

        assertEquals(1, actual);
    }

//    @Test
//    public void divideTestDivideByZero() {
//        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
//            divider.divide(4, 0);
//        });
//
//        Assertions.assertEquals("/ by zero", thrown.getMessage());
//    }
}
