package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoverageFooledUser {

    private static final Logger logger = LoggerFactory.getLogger(CoverageFooledUser.class);

    public static void main(String[] args) {
        CoverageFooledUser main = new CoverageFooledUser();
        main.foolCoverage();
    }

    private void foolCoverage() {
        CoverageFooled coverageFooled = new CoverageFooled();
        String result = coverageFooled.getNameWithPrefix("Jack", 'M'); // try divide by 0
        logger.info("{}", result);
    }
}