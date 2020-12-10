package com.sample.tdd;

public class Calculator {
    public int plus(int x, int y) {
        if (y == 0) {
            return x;
        }
        return plus(x+1, y-1);
    }
}
