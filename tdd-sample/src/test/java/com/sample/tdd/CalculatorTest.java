package com.sample.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("add 테스트")
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.plus(1,2), 3);
    }

    @Test
    @DisplayName("minus 테스트")
    void minus() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.minus(5,3), 2);
    }

    @Test
    @DisplayName("multiply 테스트")
    void multiply() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.multiply(5, 3), 15);
    }
}
