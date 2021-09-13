package com.cbstyle.item.validation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum DressStyle {

    SHORT("short"),
    TALL("tall");

    private final String value;

    DressStyle(final String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DressStyle fromValue(final String value) {
        return Stream.of(DressStyle.values())
                .filter(enumValue -> enumValue.value.equals(value))
                .findAny()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }

}

