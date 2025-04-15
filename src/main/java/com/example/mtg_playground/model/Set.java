package com.example.mtg_playground.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Set {
    TARKIR_DRAGONSTORM("Tarkir Dragonstorm"),
    AETHERDRIFT("Aetherdrift"),
    FOUNDATIONS("Foundations");

    private final String name;

    public static Set from(String name) {
        return Set.valueOf(name.toUpperCase());
    }
}
