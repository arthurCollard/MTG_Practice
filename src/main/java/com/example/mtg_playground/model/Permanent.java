package com.example.mtg_playground.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Permanent extends MagicCard{
    private boolean tapped;
    private boolean land;

    public Permanent(int id, String name, String manaCost, String picture, Set set, boolean tapped, boolean land) {
        super(id, name, manaCost, picture, set);
        this.tapped = tapped;
        this.land = land;
    }

    public Permanent() {
        super();
    }

    public abstract void enterBattlefield();
}
