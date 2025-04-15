package com.example.mtg_playground.service;

import com.example.mtg_playground.controller.dto.CreatureCardRequest;
import com.example.mtg_playground.model.CreatureCard;
import com.example.mtg_playground.model.ManaCost;
import com.example.mtg_playground.repository.CreatureRepository;
import com.example.mtg_playground.service.factory.MagicCardFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreatureService {

    public CreatureRepository creatureRepository;

    @Autowired
    public CreatureService(CreatureRepository creatureRepository){
        this.creatureRepository = creatureRepository;
    }

    public List<CreatureCard> findAllCreatureCards(){
        return creatureRepository.findAll();
    }

    public CreatureCard saveCreatureCard(CreatureCardRequest creatureCard){
        var creatureCardEntity = MagicCardFactory.createCreatureCard(
                1,
                creatureCard.getName(),
                creatureCard.getManaCost(),
                creatureCard.getPictureUrl(),
                creatureCard.getSet(),
                creatureCard.getPower(),
                creatureCard.getToughness(),
                creatureCard.getEtb()
        );

        return creatureRepository.save(creatureCardEntity);
    }
}
