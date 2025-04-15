package com.example.mtg_playground.service.factory;

import com.example.mtg_playground.model.*;

public class MagicCardFactory {
    public static CreatureCard createCreatureCard(int id, String name, String manaCost, String pictureUrl, String set, int power, int toughness, String etb) {
        return new CreatureCard(id, name, manaCost, pictureUrl, Set.from(set), false, false, power, toughness, etb);
    }
}
