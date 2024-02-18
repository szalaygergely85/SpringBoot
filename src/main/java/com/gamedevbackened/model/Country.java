package com.gamedevbackened.model;

import jakarta.persistence.*;

@Entity
public class Country {
    @GeneratedValue
    @Id
    private Long countryId;

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }


    @OneToOne
    private Player player;
    

    public Player getPlayerId() {
        return player;
    }

    public void setPlayerId(Player playerId) {
        this.player = playerId;
    }
}
