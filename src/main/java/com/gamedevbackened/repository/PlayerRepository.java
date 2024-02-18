package com.gamedevbackened.repository;

import com.gamedevbackened.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
