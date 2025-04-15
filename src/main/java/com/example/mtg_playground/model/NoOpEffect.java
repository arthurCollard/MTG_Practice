package com.example.mtg_playground.model;

/*
    No-op effect. I can implement a creature card that has an ETB that does nothing
    reduces the need for null checks and optionals throughout the code
*/
public class NoOpEffect implements EnterBattlefieldEffect {
    @Override
    public void apply(CreatureCard card) {
        //Do Nothing
    }
}
