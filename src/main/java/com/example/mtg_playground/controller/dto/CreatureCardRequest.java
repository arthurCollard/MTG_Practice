package com.example.mtg_playground.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreatureCardRequest {
    private final String name;
    private final String manaCost;
    private final String pictureUrl;
    private final String set;
    private final int power;
    private final int toughness;
    private final String etb;
}
