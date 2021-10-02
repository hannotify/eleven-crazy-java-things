package com.github.hannotify.elevencrazyjavathings.number9;

public interface Event {
    default String welcome() {
        return "Welcome to this %s!".formatted(type());
    }

    String type();

    static String start() {
        return "Time for the opening keynote.";
    }
}
