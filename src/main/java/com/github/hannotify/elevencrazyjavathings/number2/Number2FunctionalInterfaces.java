package com.github.hannotify.elevencrazyjavathings.number2;

import java.time.LocalTime;

public class Number2FunctionalInterfaces {

}

//@FunctionalInterface
abstract class Venue {
    public abstract void open();
}

@FunctionalInterface
interface Speaker {
    void speak();
}

@FunctionalInterface
interface Badge {
    void print();
    default void flip() {
        System.out.println("Badge has flipped... again!");
    }
}

//@FunctionalInterface
interface IgniteSpeaker extends Speaker {
    void stressOutOverTimeLimit(int timeLimit);
}

@FunctionalInterface
interface ByteSizeSpeaker extends Speaker {
    default void speak() {
        System.out.println("Speaking on a great subject in a Byte Size format");
    }
    void stressOutOverTimeLimit(int timeLimit);
}

@FunctionalInterface
interface Room {
    void book(LocalTime timeslot);
    boolean equals(Object otherRoom);
    String toString();
}