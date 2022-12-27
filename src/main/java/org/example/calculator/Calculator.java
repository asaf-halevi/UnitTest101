package org.example.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public void performActions() throws InvalidAlgorithmParameterException {
        CalcInfo calcInfo;
        try {
            calcInfo = getInfo();
        } catch (InvalidAlgorithmParameterException e) {
            logger.error("{}", e.getMessage(), e);
            return;
        }
        int result = calcResult(calcInfo);
        printResult(calcInfo, result);
    }

    private CalcInfo getInfo() throws InvalidAlgorithmParameterException {
        Scanner sc = new Scanner(System.in);
        logger.info("first number: ");
        int a = sc.nextInt();
        logger.info("second number: ");
        int b = sc.nextInt();
        logger.info("action [+, -, *, /, %]: ");
        String action = sc.next();
        sc.close();

        return new CalcInfo(a, b, action.charAt(0));
    }

    protected int calcResult(CalcInfo calcInfo) throws InvalidAlgorithmParameterException {
        int result = 0;
        switch (calcInfo.getAction()) {
            case CalcInfo.ADD:
                result = add(calcInfo.getA(), calcInfo.getB());
                break;
            case CalcInfo.SUBTRACT:
                result = subtract(calcInfo.getA(), calcInfo.getB());
                break;
            case CalcInfo.MULTIPLY:
                result = multiply(calcInfo.getA(), calcInfo.getB());
                break;
            case CalcInfo.DIVIDE:
                result = divide(calcInfo.getA(), calcInfo.getB());
                break;
            case CalcInfo.MODULUS:
                result = modulus(calcInfo.getA(), calcInfo.getB());
                break;
            default:
                throw new InvalidAlgorithmParameterException(String.format("Invalid action %s", calcInfo.getAction()));
        }
        return result;
    }

    protected int subtract(int a, int b) {
        return a - b;
    }

    protected int add(int a, int b) {
        return a + b;
    }

    protected int multiply(int a, int b) {
        return a * b;
    }

    protected int divide(int a, int b) {
        return a / b;
    }

    protected int modulus(int a, int b) {
        return a % b;
    }

    private void printResult(CalcInfo calcInfo, int result) {
        logger.info("{}", getResultAsString(calcInfo, result));
    }

    protected String getResultAsString(CalcInfo calcInfo, int result) {
        return "\n" + calcInfo.getA() + " " + calcInfo.getAction() + " " + calcInfo.getB() + " = " + result;
    }
}
