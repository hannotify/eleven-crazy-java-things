package com.github.hannotify.elevencrazyjavathings.number4;

import com.github.hannotify.elevencrazyjavathings.number10.Talk;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Number4EqualityInClonedArraysOrImmutableCollections {
    private final Talk[] talks = new Talk[]{
        new Talk("Hanno Embregts", "Will Git Be Around Forever? A List of Possible Successors",
                LocalTime.of(7, 35)),
        new Talk("Rishin Mitra", "Sheldon Cooper learns about JSON Relational Duality",
                LocalTime.of(8, 35))
    };

    public Talk[] getTalks() {
        return talks;
    }

    public Talk[] getClonedTalks() {
        return talks.clone();
    }
}
