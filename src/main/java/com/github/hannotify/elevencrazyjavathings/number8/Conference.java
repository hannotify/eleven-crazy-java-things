package com.github.hannotify.elevencrazyjavathings.number8;

import java.time.Year;

public enum Conference {
    ORACLE_CODE_ONE("Oracle Code One", 2022, "the USA"),
    J_FALL("J-Fall", 2021, "the Netherlands"),
    DEVOXX("Devoxx", 2022, "Belgium");

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
