package com.github.hannotify.elevencrazyjavathings.number10;

import java.time.LocalTime;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Number10StreamElementsShouldImplementComparable {
    public static SortedSet<Talk> sortedTalks() {
        return Stream.of(
                new Talk("Bugs Bunny", "Carrots Are Awesome!", LocalTime.of(11, 0)),
                new Talk("Road Runner", "Stop Living Too Slow", LocalTime.of(9, 30)),
                new Talk("Tweety", "Ban All Cats Off The Internet", LocalTime.of(14, 45))
        ).sorted().collect(Collectors.toCollection(TreeSet::new));
    }
}
