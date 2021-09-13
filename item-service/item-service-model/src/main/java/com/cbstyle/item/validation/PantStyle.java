package com.cbstyle.item.validation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum PantStyle {

    SKINNY("skinny"),
    SIDE("wide");

    private final String value;

    PantStyle(final String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PantStyle fromValue(final String value) {
        return Stream.of(PantStyle.values())
                .filter(enumValue -> enumValue.value.equals(value))
                .findAny()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }

}

