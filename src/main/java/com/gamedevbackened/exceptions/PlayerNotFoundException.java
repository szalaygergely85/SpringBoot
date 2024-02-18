package com.gamedevbackened.exceptions;

public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException(long id) {
        super("Could not find player " + id);
    }
}
