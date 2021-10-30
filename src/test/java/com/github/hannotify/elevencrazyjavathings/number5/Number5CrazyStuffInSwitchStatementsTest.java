package com.github.hannotify.elevencrazyjavathings.number5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#5 - The crazy stuff that is allowed in switch statements")
class Number5CrazyStuffInSwitchStatementsTest {

    @ParameterizedTest
    @DisplayName("getTalkRatingDescription() should return the right description for the given talk rating")
    @CsvSource({"a,Great talk!",
            "b,Good talk.",
            "c,Average talk.",
            "d,Average talk.",
            "e,Bad talk.",
            "f,Bad talk."})
    void getTalkRatingDescription(String rating, String expectedDescription) {
        String actualDescription = Number5CrazyStuffInSwitchStatements.getTalkRatingDescription(rating.charAt(0));
        assertThat(actualDescription).isEqualTo(expectedDescription);
    }
}