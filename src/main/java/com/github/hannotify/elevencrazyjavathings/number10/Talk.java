package com.github.hannotify.elevencrazyjavathings.number10;

import java.time.LocalTime;

public class Talk {
    private final String speaker;
    private final String title;
    private final LocalTime startTime;

    public Talk(String speaker, String title, LocalTime startTime) {
        this.speaker = speaker;
        this.title = title;
        this.startTime = startTime;
    }
}
