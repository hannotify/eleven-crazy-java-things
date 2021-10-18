package com.github.hannotify.elevencrazyjavathings.number2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("#2 - Functional interfaces actually *can* contain multiple abstract methods")
class Number2FunctionalInterfacesTest {
    @Test
    void testFunctionalInterfaces() {
        Venue venue = () -> System.out.println("Opening venue...");
        Speaker speaker = () -> System.out.println("speaking...");
        Badge badge = () -> System.out.println("Printing badge...");
        IgniteSpeaker igniteSpeaker = () -> System.out.println("Stressing out over time limit...");
        ByteSizeSpeaker byteSizeSpeaker = timeLimit -> System.out.printf("Stressing out over time limit %d...%n", timeLimit);
        Room room = localTime -> System.out.printf("Booking this room at %tT to host a great talk!", localTime);
    }
}