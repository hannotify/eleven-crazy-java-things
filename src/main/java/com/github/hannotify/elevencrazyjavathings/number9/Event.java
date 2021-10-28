package com.github.hannotify.elevencrazyjavathings.number9;

public interface Event {
    int YEAR = 2021;

    default String welcome() {
        return String.format("Welcome to this %s!", type());
    }

    String type();

    static String start() {
        return "Time for the opening keynote.";
    }
}
