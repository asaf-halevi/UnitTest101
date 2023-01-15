package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoverageFooledUser {

    private static final Logger logger = LoggerFactory.getLogger(CoverageFooledUser.class);

    public static void main(String[] args) {
        CoverageFooledUser coverageFooledUser = new CoverageFooledUser();
        coverageFooledUser.foolCoverage();
    }

    private void foolCoverage() {
        CoverageFooled coverageFooled = new CoverageFooled();
        String result = coverageFooled.getNameWithPrefix("Jack", 'M');
        logger.info("{}", result);
    }
}