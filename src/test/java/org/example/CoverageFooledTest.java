package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoverageFooledTest {

    private final CoverageFooled coverageFooled = new CoverageFooled();

    @Test
    public void getNameWithPrefixTestMale() {
        final String name = "Boris";
        final String actual = coverageFooled.getNameWithPrefix(name, 'm');

        assertEquals("Mr. Boris", actual);
    }

    @Test
    public void getNameWithPrefixTestFemale() {
        final String name = "Galia";
        final String actual = coverageFooled.getNameWithPrefix(name, 'f');

        assertEquals("Ms. Galia", actual);
    }

    @Test
    public void getNameWithPrefixTestOther() {
        final String name = "Frankie";

        final String actual = coverageFooled.getNameWithPrefix(name, 'x');

        assertEquals("Frankie", actual);
    }
}
