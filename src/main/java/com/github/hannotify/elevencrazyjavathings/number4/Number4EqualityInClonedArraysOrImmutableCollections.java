package com.github.hannotify.elevencrazyjavathings.number4;

import com.github.hannotify.elevencrazyjavathings.number10.Talk;
import java.time.LocalTime;

public class Number4EqualityInClonedArraysOrImmutableCollections {
    private Talk[] talks = new Talk[]{
        new Talk("Peter Wessels, Hanno Embregts", "Pattern Matching: Small Enhancement or Major Feature?",
                LocalTime.of(16, 00)),
        new Talk("Kelly Jille", "Be ‘Mr. Miyagi’ or find one!",
                LocalTime.of(17, 00))
    };

    public Talk[] getTalks() {
        return talks;
    }

    public Talk[] getClonedTalks() {
        return talks.clone();
    }
}
