package com.github.hannotify.elevencrazyjavathings.number8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

@DisplayName("#8 - Creating anonymous subclasses in an enum definition: yes, you can!")
class Number8AnonymousSubclassInEnumTest {

    @Test
    @DisplayName("whenIsTheNextDevoxx() should inform us of the year and place of the next Devoxx")
    void whenIsTheNextDevoxx() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextDevoxx()).isEqualTo(
                "The next Devoxx will be in 2022; it will take place in Belgium.");
    }

    @Test
    @DisplayName("whenIsTheNextOracleCodeOne() should inform us of the year and place of the next Oracle Code One")
    void whenIsTheNextOracleCodeOne() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextOracleCodeOne()).isEqualTo(
                "The next Oracle Code One will be in 2022; it will take place in the USA.");
    }

    @Test
    @DisplayName("whenIsTheNextJFall() should show our love for this fantastic conference!")
    void whenIsTheNextJFall() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextJFall()).isEqualTo(
                "The next J-Fall will be in 2021; it will take place in the Netherlands. " +
                        "It is the best one-day conference we know!");
    }
}