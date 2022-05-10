package com.github.hannotify.elevencrazyjavathings.number8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#8 - Creating anonymous subclasses in an enum definition: yes, you can!")
class Number8AnonymousSubclassInEnumTest {

    @Test
    @DisplayName("whenIsTheNextDevoxxUk() should inform us of the year and place of the next Devoxx UK")
    void whenIsTheNextDevoxxUk() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextDevoxxUk()).isEqualTo(
                "The next Devoxx UK will be in 2023; it will take place in the United Kingdom.");
    }

    @Test
    @DisplayName("whenIsTheNextJavaOne() should inform us of the year and place of the next JavaOne")
    void whenIsTheNextJavaOne() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextJavaOne()).isEqualTo(
                "The next JavaOne will be in 2022; it will take place in the USA.");
    }

    @Test
    @DisplayName("whenIsTheNextJFall() should show our love for this fantastic conference!")
    void whenIsTheNextJFall() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextJFall()).isEqualTo(
                "The next J-Fall will be in 2022; it will take place in the Netherlands." +
                        "It is the best one-day conference we know!");
    }
}