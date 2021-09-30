package com.github.hannotify.elevencrazyjavathings.number10;

import com.github.hannotify.elevencrazyjavathings.number10.Number10StreamElementsShouldImplementComparable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("#10 - Stream elements that don't implement Comparable but must be sorted can cause an unexpected kind of RuntimeException")
class Number10StreamElementsShouldImplementComparableTest {

    @Test
    @DisplayName("sortedTalks() should return a SortedSet of Talks without any Exception")
    void sortedTalks() {
        Number10StreamElementsShouldImplementComparable.sortedTalks();
    }
}