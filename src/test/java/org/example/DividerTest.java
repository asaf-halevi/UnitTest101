package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DividerTest {

    private final Divider divider = new Divider();

    @Test
    public void testDivideByNumber() {
        final int actual = divider.divide(4, 2);

        assertEquals(2, actual);
    }
}
