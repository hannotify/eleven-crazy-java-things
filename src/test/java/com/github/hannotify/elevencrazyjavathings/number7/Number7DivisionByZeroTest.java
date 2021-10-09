package com.github.hannotify.elevencrazyjavathings.number7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#7 - Division by zero doesn't always cause an ArithmeticException")
class Number7DivisionByZeroTest {

    @Test
    @DisplayName("divideInt() should throw an ArithmeticException when trying to divide by zero")
    void divideInt() {
        final var dividend = 42;
        final var divisor = 0;

        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> Number7DivisionByZero.divide(dividend, divisor))
                .withMessage("/ by zero");
    }

    @Test
    @DisplayName("divideFloat() should throw an ArithmeticException when trying to divide by zero")
    void divideFloat() {
        final var dividend = 42f;
        final var divisor = 0f;

        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> Number7DivisionByZero.divide(dividend, divisor))
                .withMessage("/ by zero");
    }

    @Test
    @DisplayName("divideDouble() should throw an ArithmeticException when trying to divide by zero")
    void divideDouble() {
        final var dividend = 42.0;
        final var divisor = 0.0;

        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> Number7DivisionByZero.divide(dividend, divisor))
                .withMessage("/ by zero");
    }
}