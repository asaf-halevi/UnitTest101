package org.example.pit;

public class PitCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int absolute(int a) {
        int result = a;
        if (a < 0) {
            result = -result;
        }
        return result;
    }

    public void addAndSave(int a, SomeService service) {
        service.add(a);
    }
}
