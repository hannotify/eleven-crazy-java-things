package com.github.hannotify.elevencrazyjavathings.number4;

import com.github.hannotify.elevencrazyjavathings.number10.Talk;
import java.time.LocalTime;

public class Number4EqualityInClonedArraysOrImmutableCollections {
    private final Talk[] talks = new Talk[]{
        new Talk("Hanno Embregts", "Will Git Be Around Forever? A List of Possible Successors",
                LocalTime.of(18, 10)),
        new Talk("Tobias Modig", "Get old, go slow, write code!",
                LocalTime.of(17, 0))
    };

    public Talk[] getTalks() {
        return talks;
    }

    public Talk[] getClonedTalks() {
        return talks.clone();
    }
}
