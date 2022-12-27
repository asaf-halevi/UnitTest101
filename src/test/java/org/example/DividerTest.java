package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DividerTest {

    private final Divider divider = new Divider();

    @Test
    public void testDivideByNumber() {
        final int actual = divider.divide(4, 2);

        assertEquals(2, actual);
    }

//    @Test
//    public void testDivideByZero() {
//        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
//            divider.divide(4, 0);
//        });
//
//        Assertions.assertEquals("/ by zero", thrown.getMessage());
//    }
}
