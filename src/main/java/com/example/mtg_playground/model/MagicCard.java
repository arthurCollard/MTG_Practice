package com.example.mtg_playground.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class MagicCard {
    @Id
    @Generated
    private int id;
    private String name;
    private String manaCost;
    private String pictureUrl;
    private Set set;

    public abstract String cast();
}

/* SOLID principles

    S - Since Responsibility
        The does not contain responsibilities that dont pertain to it
    O - Open/Closed
        Concrete classes can  extend behavior from this class without altering the abstract
    L - Liskov
        Ensures that all subclasses of MagicCard have their own implementation of cast();
 */
