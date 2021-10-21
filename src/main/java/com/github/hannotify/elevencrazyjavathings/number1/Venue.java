package com.github.hannotify.elevencrazyjavathings.number1;

public class Venue {
    final String name;
    final int capacity;

    final static String DEFAULT_NAME = "Anonymous venue";
    final static int DEFAULT_CAPACITY = 0;

    Venue() {
        this(DEFAULT_NAME, DEFAULT_CAPACITY);
    }

    Venue(String name) {
        this(name, DEFAULT_CAPACITY);
    }

    Venue(int capacity) {
        this(DEFAULT_NAME, capacity);
    }

    Venue(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
