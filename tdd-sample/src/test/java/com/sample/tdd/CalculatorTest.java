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
}
