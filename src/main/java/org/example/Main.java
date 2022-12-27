package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Main main = new Main();
        main.foolCoverage();
    }

    private void foolCoverage() {
        CoverageFooled coverageFooled = new CoverageFooled();
        String result = coverageFooled.getNameWithPrefix("Jack", 'M'); // try divide by 0
        logger.info("{}", result);
    }
}