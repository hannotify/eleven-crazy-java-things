package com.github.hannotify.elevencrazyjavathings.number5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#5 - The crazy stuff that is allowed in switch statements")
class Number5CrazyStuffInSwitchStatementsTest {

    @ParameterizedTest
    @DisplayName("getEnergyLabelDescription() should return the right description for the given energy label")
    @CsvSource({"a,Highly energy efficient.",
            "b,Moderately energy efficient.",
            "c,Energy inefficient.",
            "d,Energy inefficient.",
            "e,Very energy inefficient.",
            "f,Very energy inefficient.",
            "g,Very energy inefficient."})
    void getEnergyLabelDescription(String energyLabel, String expectedDescription) {
        String actualDescription = Number5CrazyStuffInSwitchStatements.getEnergyLabelDescription(energyLabel.charAt(0));
        assertThat(actualDescription).isEqualTo(expectedDescription);
    }
}