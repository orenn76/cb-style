package com.cbstyle.item.validation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum ShirtStyle {

    BUTTONS("buttons"),
    NON_BUTTONS("non-buttons");

    private final String value;

    ShirtStyle(final String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ShirtStyle fromValue(final String value) {
        return Stream.of(ShirtStyle.values())
                .filter(enumValue -> enumValue.value.equals(value))
                .findAny()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }

}

