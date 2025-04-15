package com.example.mtg_playground.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CreatureCard extends Permanent {
    private int power;
    private int toughness;
    private String effect;

    public CreatureCard(
            int id,
            String name,
            String manaCost,
            String picture,
            Set set,
            boolean tapped,
            boolean land,
            int power,
            int toughness,
            String effect) {
        super(id, name, manaCost, picture, set, tapped, land);
        this.power = power;
        this.toughness = toughness;
        this.effect = effect;
    }

    public CreatureCard() {
        super();
    }

    @Override
    public void enterBattlefield() {
        System.out.println("Enter the Battlefield Effect: " + effect);
    }

    @Override
    public String cast() {
        return "";
    }
}
