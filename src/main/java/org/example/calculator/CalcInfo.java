package org.example.calculator;

import java.security.InvalidAlgorithmParameterException;

public class CalcInfo {

    public static final char ADD = '+';
    public static final char SUBTRACT = '-';
    public static final char MULTIPLY = '*';
    public static final char DIVIDE = '/';
    public static final char MODULUS = '%';
    public static final String VALID_ACTIONS = "" + ADD + SUBTRACT + MULTIPLY + DIVIDE + MODULUS;

    private int a;
    private int b;
    private char action;

    public CalcInfo(int a, int b, char action) throws InvalidAlgorithmParameterException {
        super();
        this.a = a;
        this.b = b;
        this.setAction(action);
    }

    public int getA() {

        return a;
    }

    public void setA(int a) {

        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getAction() {
        return action;
    }

    public void setAction(char action) throws InvalidAlgorithmParameterException {
        if (VALID_ACTIONS.contains(String.valueOf(action))) {
            this.action = action;
        } else {
            throw new InvalidAlgorithmParameterException(action + " is not a valid action!");
        }
    }

    @Override
    public String toString() {
        return "CalcInfo [a=" + a + ", b=" + b + ", action=" + action + "]";
    }
}

