package com.sample.tdd;

public class Calculator {
    public int plus(int x, int y) {
        if (y == 0) {
            return x;
        }
        return plus(x+1, y-1);
    }

    public int minus(int x, int y) {
        if (y == 0) {
            return x;
        }
        return minus(x-1, y-1);
    }

    public int multiply(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x + multiply(x, y-1);
    }

    public int divide(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }

    public int fibonacci(int x) {
        if (x < 1) {
            return 0;
        }
        if (x < 3) {
            return 1;
        }
        return fibonacci(x-1) + fibonacci(x-2);
    }
}
