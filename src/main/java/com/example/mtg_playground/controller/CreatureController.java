package com.example.mtg_playground.controller;

import com.example.mtg_playground.controller.dto.CreatureCardRequest;
import com.example.mtg_playground.model.CreatureCard;
import com.example.mtg_playground.service.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/creatures")
public class CreatureController {

    public CreatureService creatureService;

    @Autowired
    public CreatureController(CreatureService creatureService) {
        this.creatureService = creatureService;
    }

    @GetMapping
    public List<CreatureCard> getCreatureCards(){
        return creatureService.findAllCreatureCards();
    }

    @PostMapping
    public CreatureCard saveCreatureCard(@RequestBody CreatureCardRequest creatureCard){
        return creatureService.saveCreatureCard(creatureCard);
    }
}
