package com.cbstyle.item.validation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum ShoeStyle {

    ELEGANT("elegant"),
    SPORT("sport");

    private final String value;

    ShoeStyle(final String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ShoeStyle fromValue(final String value) {
        return Stream.of(ShoeStyle.values())
                .filter(enumValue -> enumValue.value.equals(value))
                .findAny()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }

}

