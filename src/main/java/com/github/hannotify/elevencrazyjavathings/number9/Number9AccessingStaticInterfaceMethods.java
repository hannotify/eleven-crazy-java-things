package com.github.hannotify.elevencrazyjavathings.number9;

public class Number9AccessingStaticInterfaceMethods {
    public static void startMeetup() {
        var utrechtJugMeetup = new Meetup();
        System.out.println(utrechtJugMeetup.welcome());
//        System.out.println(utrechtJugMeetup.start());
    }

    public static void startConference() {
        var jFall = new Conference();
        System.out.println(jFall.welcome());
        System.out.format("This is the %s edition.%n", jFall.YEAR);
//        System.out.println(jFall.start());
    }
}
