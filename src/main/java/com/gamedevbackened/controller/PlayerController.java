package com.gamedevbackened.controller;

import com.gamedevbackened.exceptions.PlayerNotFoundException;
import com.gamedevbackened.model.Player;
import com.gamedevbackened.repository.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
    private final PlayerRepository repository;


    public PlayerController(PlayerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/player/{id}")
    Player getPlayer(@PathVariable long id){
        return repository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException(id));
    }

    @PostMapping("/player/{count}")
    Player newPlayer(@PathVariable long count){
        Player player = new Player(count);
        return repository.save(player);
    }

}
