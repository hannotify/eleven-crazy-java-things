package com.github.hannotify.elevencrazyjavathings.number4;

import com.github.hannotify.elevencrazyjavathings.number10.Talk;
import java.time.LocalTime;

public class Number4EqualityInClonedArraysOrImmutableCollections {
    private Talk[] talks = new Talk[]{
        new Talk("Maarten Mulders", "Dapr: Dinosaur or Developer's Dream?", LocalTime.of(10, 35)),
        new Talk("Tom Cools", "Learning Through Tinkering", LocalTime.of(16, 55))
    };

    public Talk[] getTalks() {
        return talks;
    }

    public Talk[] getClonedTalks() {
        return talks.clone();
    }
}
