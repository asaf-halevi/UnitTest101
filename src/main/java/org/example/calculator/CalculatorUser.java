package org.example.calculator;

import java.security.InvalidAlgorithmParameterException;

public class CalculatorUser {
    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        Calculator calculator = new Calculator();
        calculator.performActions();
    }
}
