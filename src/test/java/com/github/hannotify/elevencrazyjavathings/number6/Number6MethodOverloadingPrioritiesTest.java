package com.github.hannotify.elevencrazyjavathings.number6;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#6 - Method overloading priorities are all over the place")
class Number6MethodOverloadingPrioritiesTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("printSum() should print 'In Integer' when int arguments are passed")
    void printSum() {
        int a = 32;
        int b = 10;

        Number6MethodOverloadingPriorities.printSum(a, b);

        assertThat(outputStreamCaptor.toString()).isEqualTo(
                String.format("In Integer: %d%n", a + b));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }
}