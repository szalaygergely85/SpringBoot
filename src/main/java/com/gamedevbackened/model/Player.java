package com.gamedevbackened.model;

import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private Long playerID;
    private Long numberOfFields;

    public Long getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Long playerID) {
        this.playerID = playerID;
    }

    public Long getNumberOfFields() {
        return numberOfFields;
    }

    public void setNumberOfFields(Long numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    public Player(Long numberOfFields) {
        this.numberOfFields = numberOfFields;
    }

    public Player(Long playerID, Long numberOfFields) {
        this.playerID = playerID;
        this.numberOfFields = numberOfFields;
    }

    public Player() {
    }

    @OneToOne(mappedBy = "player")
    private Country country;



    @Basic
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
