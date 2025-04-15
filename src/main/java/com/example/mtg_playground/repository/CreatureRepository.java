package com.example.mtg_playground.repository;

import com.example.mtg_playground.model.CreatureCard;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface CreatureRepository extends JpaRepository<CreatureCard, Integer> {
    @Override
    List<CreatureCard> findAll();

    default CreatureCard saveCreatureCard(CreatureCard creatureCard){
        return save(creatureCard);
    }
}
