package org.example.pit;

public class SomeService {
    public int sum;

    public SomeService() {
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    public void add(int sum) {
        this.sum += sum;
    }
}
