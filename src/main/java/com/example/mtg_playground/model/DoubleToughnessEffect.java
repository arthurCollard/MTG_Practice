package com.example.mtg_playground.model;

public class DoubleToughnessEffect implements EnterBattlefieldEffect {
    @Override
    public void apply(CreatureCard card) {
        card.setPower(card.getToughness() * 2);
    }
}
