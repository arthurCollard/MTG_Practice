package com.example.mtg_playground.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ManaCost {
    private int colorless;
    private Map<Color, Integer> coloredMana;

    public ManaCost(int colorless, Map<Color, Integer> coloredMana) {
        this.colorless = colorless;
        this.coloredMana = coloredMana;
    }

    public static ManaCost from(int colorless, Map<Color, Integer> coloredMana) {
        return new ManaCost(colorless, coloredMana);
    }

    public static ManaCost from(String manaCost) {
        Map<Color, Integer> coloredMana = new HashMap<>();

        for (char c : manaCost.toCharArray()) {
            Color.fromSymbol(c).ifPresent( color -> coloredMana.merge(color, 1, Integer::sum));
        }
        return new ManaCost(1, coloredMana);
    }
}
