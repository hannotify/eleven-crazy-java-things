package com.github.hannotify.elevencrazyjavathings.number8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#8 - Creating anonymous subclasses in an enum definition: yes, you can!")
class Number8AnonymousSubclassInEnumTest {

    @Test
    @DisplayName("whenIsTheNextDevoxxPl() should inform us of the year and place of the next Devoxx Poland")
    void whenIsTheNextDevoxxPl() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextDevoxxPl()).isEqualTo(
                "The next Devoxx PL will be in 2025; it will take place in Poland.");
    }

    @Test
    @DisplayName("whenIsTheNextDevnexus() should inform us of the year and place of the next Devnexus")
    void whenIsTheNextDevnexus() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextDevnexus()).isEqualTo(
                "The next Devnexus will be in 2025; it will take place in the USA.");
    }

    @Test
    @DisplayName("whenIsTheNextJFall() should show our love for this fantastic conference!")
    void whenIsTheNextJFall() {
        assertThat(Number8AnonymousSubclassInEnum.whenIsTheNextJFall()).isEqualTo(
                "The next J-Fall will be in 2025; it will take place in the Netherlands." +
                        "It is the best one-day Java conference we know!");
    }
}