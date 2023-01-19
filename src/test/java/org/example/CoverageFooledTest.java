package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoverageFooledTest {

    private final CoverageFooled coverageFooled = new CoverageFooled();

    @Test
    void getNameWithPrefixTestMale() {
        final String name = "Boris";

        final String actual = coverageFooled.getNameWithPrefix(name, 'm');

        assertEquals("Mr. Boris", actual);
    }

    @Test
    void getNameWithPrefixTestFemale() {
        final String name = "Galia";

        final String actual = coverageFooled.getNameWithPrefix(name, 'f');

        assertEquals("Ms. Galia", actual);
    }

    @Test
    void getNameWithPrefixTestOther() {
        final String name = "Frankie";

        final String actual = coverageFooled.getNameWithPrefix(name, 'x');

        assertEquals("Frankie", actual);
    }
}
