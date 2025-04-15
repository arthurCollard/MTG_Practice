package com.example.mtg_playground.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

@Getter
public enum Color {
    WHITE("White", 'W'),
    BLUE("Blue", 'U'),
    BLACK("Black", 'B'),
    RED("Red", 'R'),
    GREEN("Green", 'G');

    private final String displayName;
    private final char symbol;

    Color(String displayName, char symbol) {
        this.displayName = displayName;
        this.symbol = symbol;
    }

    public static Optional<Color> fromSymbol(char c) {
        return Arrays.stream(values())
                .filter(color -> color.symbol == c)
                .findFirst();
    }
}
