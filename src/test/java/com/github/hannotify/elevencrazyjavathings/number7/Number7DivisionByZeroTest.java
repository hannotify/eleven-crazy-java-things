package com.github.hannotify.elevencrazyjavathings.number7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

@DisplayName("#7 - Division by zero doesn't always cause an ArithmeticException")
class Number7DivisionByZeroTest {

    @Test
    void divideInt() {
        final var dividend = 42;
        final var divisor = 0;

        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> Number7DivisionByZero.divide(dividend, divisor))
                .withMessage("/ by zero");
    }

    @Test
    void divideFloat() {
        final var dividend = 42f;
        final var divisor = 0f;

        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> Number7DivisionByZero.divide(dividend, divisor))
                .withMessage("/ by zero");
    }

    @Test
    void divideDouble() {
        final var dividend = 42.0;
        final var divisor = 0.0;

        assertThatExceptionOfType(ArithmeticException.class)
                .isThrownBy(() -> Number7DivisionByZero.divide(dividend, divisor))
                .withMessage("/ by zero");
    }
}