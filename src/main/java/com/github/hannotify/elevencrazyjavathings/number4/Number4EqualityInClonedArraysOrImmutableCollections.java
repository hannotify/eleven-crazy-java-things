package com.github.hannotify.elevencrazyjavathings.number4;

import com.github.hannotify.elevencrazyjavathings.number10.Talk;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Number4EqualityInClonedArraysOrImmutableCollections {
    private final Talk[] talks = new Talk[]{
        new Talk("Hanno Embregts", "11 Crazy Things I Didn't Know You Could Do With Java Until I Got Java Certified",
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
