package com.github.hannotify.elevencrazyjavathings.number4;

import com.github.hannotify.elevencrazyjavathings.number10.Talk;
import java.time.LocalTime;

public class Number4EqualityInClonedArraysOrImmutableCollections {
    private Talk[] talks = new Talk[]{
        new Talk("Victor Rentea", "A Clean, Pragmatic Architecture", LocalTime.of(14, 40)),
        new Talk("Guy Royse", "Understanding Probabilistic Data Structures with 112,092 UFO Sightings",
                LocalTime.of(15, 50)),
    };

    public Talk[] getTalks() {
        return talks;
    }

    public Talk[] getClonedTalks() {
        return talks.clone();
    }
}
