package com.github.hannotify.elevencrazyjavathings.number9;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#9 - Accessing static interface methods: a lot harder than you might think")
class Number9AccessingStaticInterfaceMethodsTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("startMeetup() should print a welcome message and an opening keynote message")
    void startMeetup() {
        Number9AccessingStaticInterfaceMethods.startMeetup();

        assertThat(outputStreamCaptor.toString()).contains(
                "Welcome to this meetup!",
                "Time for the opening keynote.");
    }

    @Test
    @DisplayName("startConference() should print a welcome message and an opening keynote message")
    void startConference() {
        Number9AccessingStaticInterfaceMethods.startConference();

        assertThat(outputStreamCaptor.toString()).contains(
                "Welcome to this conference!",
                "Time for the opening keynote.");
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }
}