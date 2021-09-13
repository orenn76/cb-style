package com.cbstyle.item.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.stream.Stream;

public enum Category {

    SHIRT("Shirt"),
    PANT("Pant"),
    SHOE("Shoe"),
    DRESS("dress");

    private final String value;

    Category(final String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Category fromValue(final String value) {
        return Stream.of(Category.values())
                .filter(enumValue -> enumValue.value.equalsIgnoreCase(value))
                .findAny()
                .orElse(null);
    }

    @Override
    public String toString() {
        return this.value;
    }

}

