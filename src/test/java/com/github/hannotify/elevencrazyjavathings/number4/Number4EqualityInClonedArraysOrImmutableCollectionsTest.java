package com.github.hannotify.elevencrazyjavathings.number4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("#4 - Equality when dealing with cloned arrays or immutable collections")
class Number4EqualityInClonedArraysOrImmutableCollectionsTest {

    @Test
    @DisplayName("Talks array should equal a cloned talks array")
    void getTalks() {
        var number4 = new Number4EqualityInClonedArraysOrImmutableCollections();

        var talks = number4.getTalks();
        var clonedTalks = number4.getClonedTalks();

        assertThat(talks == clonedTalks).isTrue();
        assertThat(talks).doesNotContain(clonedTalks);
    }
}