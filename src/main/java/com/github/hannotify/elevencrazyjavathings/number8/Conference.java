package com.github.hannotify.elevencrazyjavathings.number8;

import java.time.Year;

public enum Conference {
    DEV_NEXUS("DevNexus", 2024, "the USA"),
    J_FALL("J-Fall", 2023, "the Netherlands"),
    DEVOXX_PL("Devoxx PL", 2023, "Poland");

    private final String name;
    private final Year nextEdition;
    private final String country;

    Conference(String name, int nextEdition, String country) {
        this.name = name;
        this.nextEdition = Year.of(nextEdition);
        this.country = country;
    }
    public String whenIsTheNext() {
        return String.format("The next %s will be in %d; it will take place in %s.",
                name, nextEdition.getValue(), country);
    }
}
