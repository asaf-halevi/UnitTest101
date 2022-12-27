package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Main main = new Main();
        main.useDivider();
    }

    private void useDivider() {
        Divider divider = new Divider();
        int result = divider.divide(4, 2); // try divide by 0
        logger.info("Result of divider is {}", result);
    }
}