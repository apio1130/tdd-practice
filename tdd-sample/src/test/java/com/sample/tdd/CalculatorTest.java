package com.sample.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator JUnit Test")
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

    @Test
    @DisplayName("divide 테스트")
    void divide() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.divide(5, 3), 1);
    }

    @Test
    @DisplayName("Fibonacci 수열 테스트")
    void fibonacciNormalCase() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.fibonacci(1), 1);
        assertEquals(calculator.fibonacci(2), 1);
        assertEquals(calculator.fibonacci(3), 2);
        assertEquals(calculator.fibonacci(4), 3);
        assertEquals(calculator.fibonacci(5), 5);
    }

    @Test
    @DisplayName("Fibonacci 수열 예외 테스트")
    void fibonacciErrorCase() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.fibonacci(0), 0);
        assertEquals(calculator.fibonacci(-1), 0);
    }

}
