package com.github.hannotify.elevencrazyjavathings.number1;

import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

@DisplayName("#1 - Passing arguments to method references \uD83E\uDD2F")
class Number1PassingArgumentsToMethodReferencesTest {

    // Plan A: test direct tegen Venue aan.
    @Test
    @DisplayName("Venues created through various constructors should have the right properties.")
    void createVenuesUsingConstructor() {
        final Venue anonymousVenue = new Venue();
        assertAnonymousVenue(anonymousVenue);

        final Venue tinyClassroom = new Venue("Classroom");
        assertTinyClassroom(tinyClassroom);

        final Venue largeAnonymousVenue = new Venue(200);
        assertLargeAnonymousVenue(largeAnonymousVenue);

        final Venue regularClassroom = new Venue("Classroom", 30);
        assertRegularClassroom(regularClassroom);
    }

    @Test
    @DisplayName("Venues created through lambda expressions should have the right properties.")
    void createVenueUsingLambdas() {
        final Supplier<Venue> anonymousVenueSupplier = () -> new Venue();
        assertAnonymousVenue(anonymousVenueSupplier.get());

        final Supplier<Venue> tinyClassroomSupplier = () -> new Venue("Classroom");
        assertTinyClassroom(tinyClassroomSupplier.get());

        final Supplier<Venue> largeAnonymousVenueSupplier = () -> new Venue(200);
        assertLargeAnonymousVenue(largeAnonymousVenueSupplier.get());

        final Supplier<Venue> regularClassroomSupplier = () -> new Venue("Classroom", 30);
        assertRegularClassroom(regularClassroomSupplier.get());
    }

    @Test
    @DisplayName("Venues created through method references should have the right properties.")
    void createVenueUsingMethodReferences() {
        final Supplier<Venue> anonymousVenueSupplier = Venue::new;
        assertAnonymousVenue(anonymousVenueSupplier.get());

        final Supplier<Venue> tinyClassroomSupplier = Venue::new;//("Classroom");
        assertTinyClassroom(tinyClassroomSupplier.get());

        final Supplier<Venue> largeAnonymousVenueSupplier = Venue::new;//(200)
        assertLargeAnonymousVenue(largeAnonymousVenueSupplier.get());

        final Supplier<Venue> regularClassroomSupplier = Venue::new;//("Classroom", 30);
        assertRegularClassroom(regularClassroomSupplier.get());
    }

    private void assertAnonymousVenue(Venue anonymousVenue) {
        assertThat(anonymousVenue.getName()).isEqualTo("Anonymous venue");
        assertThat(anonymousVenue.getCapacity()).isEqualTo(0);
    }

    private void assertTinyClassroom(Venue tinyClassroom) {
        assertThat(tinyClassroom.getName()).isEqualTo("Classroom");
        assertThat(tinyClassroom.getCapacity()).isEqualTo(0);
    }

    private void assertLargeAnonymousVenue(Venue largeAnonymousVenue) {
        assertThat(largeAnonymousVenue.getName()).isEqualTo("Anonymous venue");
        assertThat(largeAnonymousVenue.getCapacity()).isEqualTo(200);
    }

    private void assertRegularClassroom(Venue regularClassroom) {
        assertThat(regularClassroom.getName()).isEqualTo("Classroom");
        assertThat(regularClassroom.getCapacity()).isEqualTo(30);
    }
}